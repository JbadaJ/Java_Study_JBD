Book Manager -> 객체 지향 연습

Book : 상위 클래스로 책에 대한 속성들 선언, 속성 선언하는 함수도 생성, 정보들은 protected로 선언
EBook: Book상속받음, Book에 새로운 정보를 추가하기 위해 사용
PaperBook: Book상속받음, 새로운 정보 추가함, 재고량 관리 함수 추가함
BookManager: Book과 관련해서 리스트를 생성후 Book들 저장, CRUD기능 추가함, 관리자클래스임


이후 MainTest클래스에서 프로그램을 실행시킴
기본적으로 관리자 BookManager 생성후 책들 추가하고 CRUD기능 실행
