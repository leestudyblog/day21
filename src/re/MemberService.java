package re;

//import member.MemberDTO;

public class MemberService {
	
	private FileService fs ;
	public MemberService () {
		fs = new FileService();
	}
	
	public void save (MemberDTO dto) {
		fs.inputData(dto);
		
	}
	
	public boolean Usercheck(String name) {
		return fs.Usercheck(name);
		
	}
	public  member.MemberDTO getMember(String name) {
		return fs.readData(name);
	}
	
	
}
