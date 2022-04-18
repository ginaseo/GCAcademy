package p09_member;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import p08_jdbc.DBConn;

public class MemberMain {

	public static void main(String[] args) {
		//1.테이블생성
		//2.dto class생성
		Scanner sc = new Scanner(System.in);
		String userid;
		String passwd;
		String email;
		String name;
		String phone;
		Member m;
		MemberDAO mdao = new MemberDAO();
		//로그인 id
		String loginId="";
		
		while(true) {
			System.out.println("----------------------");
			System.out.println("회원관리 프로그램");
			System.out.println("----------------------");		
			System.out.println("1.회원추가");
			System.out.println("2.회원수정");
			System.out.println("3.회원삭제");
			System.out.println("4.회원한명조회");
			System.out.println("5.회원전체조회");
			System.out.println("6.로그인");
			System.out.println("7.종료");
			System.out.println("----------------------");
			System.out.print("번호:");
			int no = sc.nextInt();
			switch(no) {
			case 1: //회원추가			
				System.out.print("추가할 아이디는?");
				userid = sc.next();
				//회원 존재여부 체크 하고 insert해야 한다
				if (mdao.selectOne(userid)!=null) {
					System.out.println("등록된 아이디 입니다.");
					continue;
				}
				System.out.print("비밀번호는?");
				passwd = sc.next();
				System.out.print("이메일은?");
				email = sc.next();
				sc.nextLine(); //엔터값 처리
				System.out.print("이름은?");
				name =sc.nextLine();
				System.out.print("전화번호는?");
				phone = sc.next();
				m = new Member();
				m.setUserid(userid);
				m.setPasswd(passwd);
				m.setEmail(email);
				m.setName(name);
				m.setPhone(phone);
				mdao.insert(m);
				break;
			case 2://회원수정
				//로그인된 회원만 수정가능
				if (loginId.equals("")) {
					System.out.println("로그인 후 사용가능");
					continue;
				}
				System.out.print("수정할 아이디는?");
				userid = sc.next();
				//회원 존재여부 체크 하고 update해야 한다
				if (mdao.selectOne(userid)==null) {
					System.out.println("등록되지 않는 아이디 입니다.");
					continue;
				}
				System.out.print("비밀번호는?");
				passwd = sc.next();
				System.out.print("이메일은?");
				email = sc.next();
				sc.nextLine(); //엔터값 처리
				System.out.print("이름은?");
				name =sc.nextLine();
				System.out.print("전화번호는?");
				phone = sc.next();
				m = new Member();
				m.setUserid(userid);
				m.setPasswd(passwd);
				m.setEmail(email);
				m.setName(name);
				m.setPhone(phone);
				mdao.update(m);
				break;
			case 3://삭제
				//로그인된 회원만 수정가능
				if (loginId.equals("")) {
					System.out.println("로그인 후 사용가능");
					continue;
				}
				System.out.print("삭제할 아이디는?");
				userid = sc.next();
				//회원 존재여부 체크 하고 delete해야 한다
				if (mdao.selectOne(userid)==null) {
					System.out.println("등록되지 않은 아이디 입니다.");
					continue;
				}
				mdao.delete(userid);
				break;
			case 4: //회원한명 조회
				//로그인된 회원만 수정가능
				if (loginId.equals("")) {
					System.out.println("로그인 후 사용가능");
					continue;
				}
				System.out.print("조회할 아이디는?");
				userid = sc.next();
				//회원 존재여부 체크 하고 조회해야 한다
				m = mdao.selectOne(userid);
				if (m==null) {
					System.out.println("등록되지 않은 아이디 입니다.");
					continue;
				}
				System.out.println("아이디:" + m.getUserid());
				System.out.println("비밀번호:" + m.getPasswd());
				System.out.println("이메일"+m.getEmail());
				System.out.println("이름:"+m.getName());
				System.out.println("전화번호:" +m.getPhone());
				
				break;				
			case 5://전체조회
				//로그인된 회원만 수정가능
				if (loginId.equals("")) {
					System.out.println("로그인 후 사용가능");
					continue;
				}
				List<Member> mList = mdao.selectAll();
				System.out.println("-----전체 회원 명단-----");
				for(Member member:mList) {
					System.out.println("아이디:" + member.getUserid());
					System.out.println("비밀번호:" + member.getPasswd());
					System.out.println("이메일:" + member.getEmail());
					System.out.println("이름:" + member.getName());
					System.out.println("전화번호:" + member.getPhone());
					System.out.println("------------------------------");
				}
				break;
				
			case 6: //로그인
				//아이디, 패스워드 입력받아서 기존등록회원인지 아닌지 체크
				//일치하면 '로그인 되었습니다.'
				//일치하지 않으면 '등록된 회원이 아닙니다.'
				System.out.print("아이디는?");
				userid = sc.next();
				System.out.print("비밀번호는?");
				passwd = sc.next();
				int cnt = mdao.loginCheck(userid, passwd);
				//System.out.println(cnt);
				if (cnt==0) {
					System.out.println("등록된 회원이 아닙니다");
					continue;
				}
				System.out.println("로그인 되었습니다.");
				System.out.println(userid + "님 환영합니다.");
				loginId = userid; //로그인 id 저장
				break;
			case 7: //종료
				DBConn.dbClose(); //db끊기
				System.exit(0);//프로그램 종료
			default:	
				System.out.println("잘못된 번호");
			}
		}
	}

}
