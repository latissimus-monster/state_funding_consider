package Kosta.bank2;

public class MyBank {
	Customer[] customers = new Customer[10];
	int customersNum;
	
	public void addCustomer(String id, String name, long balance) {
		customers[customersNum++] = new Customer(id, name, new Account(id, balance));
	}

	public Customer getCustomer(String id) { //id가 일치하는 정보를 찾고 해당 요소 반환 -->이런식으로 써놓으면 좋을듯
		Customer cust = null; 						//null 값인데도 Customer형이라는 이유로 리턴이 가능하다니 열받는다.
		for(int i=0 ; i<customersNum; i++) {
			if(customers[i].getId().equals(id)) {
				cust = customers[i];
				break;
			}
		}
		return cust;
	}

	public Customer[] getAllCustomers() {
		Customer[] custo = new Customer[customersNum];
		for(int i=0; i < customersNum; i++) {
			custo[i] = customers[i];
		}
		return custo;
	}

}
