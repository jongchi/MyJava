package projectEx;

public class PhoneNumInfo {

		private String name;
		private String phoneNum;
		private String email;
		private String address;
		private String birthDay;
		private String group;
		
		PhoneNumInfo(String name, String phoneNum,
				String email, String address,
				String birthDay, String group){
			this.name = name;
			this.phoneNum = phoneNum;
			this.email = email;
			this.address = address;
			this.birthDay = birthDay;
			this.group = group;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhoneNum() {
			return phoneNum;
		}
		public void setPhoneNum(String phoneNum) {
			this.phoneNum = phoneNum;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getBirthDay() {
			return birthDay;
		}
		public void setBirthDay(String birthDay) {
			this.birthDay = birthDay;
		}
		public String getGroup() {
			return group;
		}
		public void setGroup(String group) {
			this.group = group;
		}
	
	void ShowInfo() {
		System.out.println("----------------------");
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNum);
		System.out.println("이메일 : " + email);
		System.out.println("주소 : " + address);
		System.out.println("생일 : " + birthDay);
		System.out.println("그룹 : " + group);
		
	}
}
