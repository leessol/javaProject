package com.shinhan.day07.LAB1;

public class ProductTest {

	public static void main(String[] args) {
		ProductVO[] productList = { new ProductVO("마이쭈", 25000, "Samsong"),
				new ProductVO("꿈틀이", 32000, "Samsong"),
				new ProductVO("짱구", 17050, "Samsong"),
				new ProductVO("새우깡", 24500, "Samsong"),
				new ProductVO("고소미", 75000, "Daehoo") };
		productList = selectProduct(productList, 25000);
		for (int i = 0; i < productList.length; i++) {
			System.out.println(productList[i].toString());
		}
	}

	//Object 를 상속받아서 ProductVO를 만든 것이다. 
	//자동형변환 : 부모타입의 참조변수 <- 자식 객체
	private static ProductVO[] selectProduct(Object[] productList, int i) {
		ProductVO [] result;
		int index = 0;
		for(Object ee: productList ) {
			//강제 형변환: 자식타입의 참조 변수 = (자식타입)부모객체
			//전제조건: 부모 객체가 동일 자식으로부터 자동 형변환 된 것들만 가능하다. 
			//위의 productList가 부모인 Object 자동 형변환이 되었다. 
			//다시 부모의 것을 강제 자식 타입으로 강제 형변환을 하려면, 동일 자식인 productList 타입만 강제 형변환 된다. 
			//무조건 강제 형변환이 되는건 아니다. 
			
			//ProductVO product = (ProductVO) ee;
			if(!(ee instanceof ProductVO product)) continue;
			if(product.getPrice()>i) {
				index++;
			}
		}
		
		//배열은 갯수를 알 수 없다면 생성 불가. 
		result = new ProductVO[index]; 
		index = 0;
		for(Object ee: productList ) {
		
			if(!(ee instanceof ProductVO product)) continue;
			if(product.getPrice()>i) {
				result[index] = product;
				index++;
			}
		}

		return result;
	}

}



















