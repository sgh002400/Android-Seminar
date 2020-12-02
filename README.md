## 1주차

### 필수 과제(10월 15일 완료)

#### 1. 실습 영상

![1차 필수과제](https://user-images.githubusercontent.com/62228195/96252438-f316fa80-0fec-11eb-8eeb-372cf68038c2.gif)  



</br>  
</br>  

#### 2. 코드


#### * MainActivity.kt
![main](https://user-images.githubusercontent.com/62228195/96252265-a7fce780-0fec-11eb-9f0d-76e6ee393f55.PNG)


#### * Sign_up.kt
![image](https://user-images.githubusercontent.com/62228195/96252336-c4991f80-0fec-11eb-8cc6-5b7f77ebfd66.png)



##2주차

### 필수 과제(11월12일 완료)

#### ![2주차 필수과제](https://user-images.githubusercontent.com/62228195/98955736-956dc380-2542-11eb-9f10-8e3f9b5232ea.gif)

#### 2. 코드

#### * ProfileData.kt

#### * ProfileViewHolder.kt
![image](https://user-images.githubusercontent.com/62228195/98956124-03b28600-2543-11eb-89c6-262bf75b4ef3.png)

#### * ProfileAdapter.kt
![image](https://user-images.githubusercontent.com/62228195/98956293-2f357080-2543-11eb-9bbc-f1631ccad645.png)

#### * SigninActivity.kt
![image](https://user-images.githubusercontent.com/62228195/98956359-46745e00-2543-11eb-92a3-2f7912065e79.png)

#### * DetailActivity.kt
![image](https://user-images.githubusercontent.com/62228195/98956427-5d1ab500-2543-11eb-8091-8dfb7dc86067.png)



## 3주차

### 필수 과제(11월 14일 완료)
![ezgif com-gif-maker](https://user-images.githubusercontent.com/62228195/99437584-056eb600-2956-11eb-8db2-f528eabf615c.gif)


#### 2. 코드

#### * SigninActivity.kt
![image](https://user-images.githubusercontent.com/62228195/100098179-04331100-2ea1-11eb-9e6a-247fd85789eb.png)

- 변경사항
- BottomNavigationView와 ViewPager를 사용하여 로그인시 Profile, Portfolio, Setting 화면이 나오도록 구성하였습니다.


#### * SigninViewPagerAdapter.kt
![image](https://user-images.githubusercontent.com/62228195/100098329-40ff0800-2ea1-11eb-8d83-5102e8f41d60.png)

#### * TablayoutAdapter.kt
![image](https://user-images.githubusercontent.com/62228195/100098605-a18e4500-2ea1-11eb-8506-64769145e96c.png)

#### * ProfileFragment.kt
![image](https://user-images.githubusercontent.com/62228195/100100931-e5cf1480-2ea4-11eb-9a20-a16c5c5e4e57.png)

- 변경사항
- SigninActivity 내의 Fragment 중 하나로 TabLayout을 사용하여 InfoFragment와 OtherFragment를 보여주었습니다.

#### * InfoFragment.kt
![image](https://user-images.githubusercontent.com/62228195/100098879-fdf16480-2ea1-11eb-863c-b8722038d650.png)

#### * OtherFragment.kt
![image](https://user-images.githubusercontent.com/62228195/100098977-1feae700-2ea2-11eb-91b7-572546514347.png)

#### * PortfolioFragment.kt
![image](https://user-images.githubusercontent.com/62228195/100098733-cd112f80-2ea1-11eb-8c88-f6b8215df2b2.png)

- 변경사항
- 기존의 SigninActivity에서 보여주던 RecyclerView를 PortfolioFragment에서 띄워주었습니다.

#### * SettingFragment.kt
![image](https://user-images.githubusercontent.com/62228195/100100091-9cca9080-2ea3-11eb-84f6-fcb576ff4bd0.png)


## 8주차

### 필수과제(12월 02일 완료)

#### Postman Test 결과

![image](https://user-images.githubusercontent.com/62228195/100913281-ea36a580-3514-11eb-9fae-ca34aee06d19.png)

![image](https://user-images.githubusercontent.com/62228195/100913302-f6226780-3514-11eb-9bbe-2241d56c1f7c.png)

![ezgif com-gif-maker](https://user-images.githubusercontent.com/62228195/100913563-4a2d4c00-3515-11eb-9102-81814fd3c96a.gif)

#### 2. 코드

#### * SignupActivity.kt
![image](https://user-images.githubusercontent.com/62228195/100913814-9ed0c700-3515-11eb-9253-d1ad66642012.png)
![image](https://user-images.githubusercontent.com/62228195/100914033-e0fa0880-3515-11eb-96f1-089813ec4569.png)

- 서버에 회원가입에 필요한 요청 바디를 보내고 응답 바디를 받아오는 코드를 작성해주었습니다.

#### * SignupRequestData.kt
![image](https://user-images.githubusercontent.com/62228195/100914081-ee16f780-3515-11eb-9040-155b8225c19c.png)

#### * SignupResponseData.kt
![image](https://user-images.githubusercontent.com/62228195/100914145-038c2180-3516-11eb-8ab0-25dd75929a8e.png)

#### * SignupService.kt
![image](https://user-images.githubusercontent.com/62228195/100914213-169ef180-3516-11eb-8e96-434d5b38a83d.png)

- 회원가입 정보를 서버에 보내주어야 하기 때문에 Post를 사용하여 보내주었습니다.

#### * SignupServiceImpl.kt
![image](https://user-images.githubusercontent.com/62228195/100914321-41894580-3516-11eb-9328-94704f712f3d.png)


#### * MainActivity.kt
![image](https://user-images.githubusercontent.com/62228195/100914530-8ad99500-3516-11eb-85c6-8e9890f45ea6.png)
![image](https://user-images.githubusercontent.com/62228195/100914589-9c22a180-3516-11eb-881d-5553110cebec.png)

#### * SigninRequestData.kt
![image](https://user-images.githubusercontent.com/62228195/100914653-ae9cdb00-3516-11eb-943e-99bf129aeb43.png)

#### * SigninResponseData.kt
![image](https://user-images.githubusercontent.com/62228195/100914728-ca07e600-3516-11eb-9420-3534a8e6223d.png)

#### * SigninService.kt
![image](https://user-images.githubusercontent.com/62228195/100914790-dbe98900-3516-11eb-95a8-c6ece1536c11.png)

- 로그인하기 위한 데이터를 서버에 전송해야 하기 때문에 Post를 사용하여 요청을 전송했습니다.

#### * SignServiceImple.kt
![image](https://user-images.githubusercontent.com/62228195/100914818-e73cb480-3516-11eb-8feb-e948358bc92e.png)
