import pandas as pd
import numpy as np

data = pd.read_csv('final_data.csv')


print('구를 입력하세요: ')
x1 = str(input())


print('한적한동네, 치안, 교육, 의료, 노인복지시설, 시장과상점가, 교통 점수를 입력하세요\n(상점가는 50개 이상의 도매,소매점포가 밀집해있는 장소입니다.)\n(이 기준이 중요하면 5점, 중요하지 않으면 1점 순으로 1-5점 사이의 점수를 입력해주세요.) : ')
want = list(map(int,input().split()))


target = data[data['자치구']==x1]

target2 = list(np.array(target.iloc[:, 2:]))

print(target2)


arr = []

for j in target2:
    difference = 0
    for i in range(len(want)):
        difference += abs(np.array(want[i])-j[i])*want[i]
    arr.append(difference)



target['차이'] = arr


final = target.sort_values(by='차이', ascending=True)[:5]


real_final = final.drop(['차이', '자치구'], axis = 1)
real_final['순위'] = [1,2,3,4,5]
real_final = real_final.set_index("순위")

print(real_final)




edu = pd.read_csv('./data_before/교육시설수.csv')
traffic = pd.read_csv('./data_before/교통.csv')
elderly = pd.read_csv('./data_before/노인복지시설수.csv')
danger = pd.read_csv('./data_before/도시위험도_범죄피해지수.csv')
crime = pd.read_csv('./data_before/범죄발생횟수.csv')
market = pd.read_csv('./data_before/시장_상점가.csv')
hospital = pd.read_csv('./data_before/의료시설수.csv')
pop = pd.read_csv('./data_before/인구밀도.csv')



print('동을 입력하세요: ')
x2 = str(input())




edu_list = edu[edu['동']==x2]
print(edu_list.drop(['합계'], axis = 1))

traffic_list = traffic[traffic['동']==x2]
print(traffic_list)

elderly_list = elderly[elderly['동']==x2]
print(elderly_list)

danger_list = danger[danger['자치구']==x1]
print(danger_list)

crime_list = crime[crime['자치구']==x1]
print(crime_list)

market_list = market[market['동']==x2]
print(market_list)

hospital_list = hospital[hospital['동']==x2]
print(hospital_list.drop(['합계'], axis = 1))

pop_list = pop[pop['동']==x2]
print(pop_list)

