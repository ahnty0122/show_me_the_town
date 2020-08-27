Show Me The Town, DongKey
==========
### 인공지능 기반 맞춤형 동네 추천 서비스
* 서울 공공데이터를 활용해 동네 정보를 다양하게 제공하고, 사용자가 중요시하는 주변환경을 고려하면서 조건의 중요도를 설정해 다양한 조합의 동네들을 보여주어 원하는 조건에 맞는 최적의 동네를 선택하는 데 도움을 주는 인공지능 기반 맞춤형 서비스
* 치안, 노인복지, 교통, 교육, 시장과 상점가, 의료시설, 인구밀도 고려

### 사용한 데이터
1. 서울시 인구밀도 통계 http://data.seoul.go.kr/dataList/10584/S/2/datasetView.do 
2. 서울시 도시위험도 통계 http://data.seoul.go.kr/dataList/144/S/2/datasetView.do
3. 서울시 5대 범죄 발생현황 통계 http://data.seoul.go.kr/dataList/316/S/2/datasetView.do
4. 서울시 유치원 현황 http://data.seoul.go.kr/dataList/OA-12058/S/1/datasetView.do
5. 서울시 초등학교 현황	http://data.seoul.go.kr/dataList/OA-12059/S/1/datasetView.do
6. 서울시 중학교 현황	http://data.seoul.go.kr/dataList/OA-12060/S/1/datasetView.do
7. 서울시 고등학교 현황	http://data.seoul.go.kr/dataList/OA-12061/S/1/datasetView.do
8. 서울시 의료기관 현황 http://data.seoul.go.kr/dataList/10123/S/2/datasetView.do
9. 서울시 노인여가 복지시설 현황 http://data.seoul.go.kr/dataList/10157/S/2/datasetView.do
10. 서울시 시장 현황 http://data.seoul.go.kr/dataList/10225/S/2/datasetView.do
11. 서울시 지하철 주변 버스정류장 정보 조회 open api http://data.seoul.go.kr/dataList/OA-12756/A/1/datasetView.do

### 데이터처리 예시
* 서울 교통 open api 이용

    col = ['지하철', '버스' ,'버스ID']
    dic = {'지하철':subwaylist, '버스':buslist, '버스ID':busIDlist}
    data = pd.DataFrame(dic)
    data.columns = col
    data 

### 사용한 알고리즘
* 입력한 항목의 중요도와 데이터 값의 차이에 입력한 항목의 중요도를 가중치로 두어 곱한 값을 합한 것이 가장 작은 top 5 동네 추천

    #target2는 자치구의모든데이터
    #want는 내가 입력한 값
    for j in target2:
        difference = 0
        for i in range(len(want)):
            difference += abs(np.array(want[i])-j[i])*want[i]
        arr.append(difference)

*실행결과

<img width="600" alt="model 실행결과" src="https://user-images.githubusercontent.com/61795757/91308604-818bae80-e7ea-11ea-8069-8ddd741f90d5.PNG">

### 최종 어플 동키
<img width="884" alt="img" src="https://user-images.githubusercontent.com/61795757/91309264-56ee2580-e7eb-11ea-8883-9fb7db6b6baf.png">
