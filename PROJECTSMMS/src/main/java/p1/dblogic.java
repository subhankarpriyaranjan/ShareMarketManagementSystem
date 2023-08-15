package p1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class dblogic {
	Connection con;
	Statement st;
	ResultSet rs;

	public ResultSet RetLogin(String username, String password, String usertype)throws SQLException,ClassNotFoundException
	{
	rs=dbconnect.getStatement().executeQuery("select  L.*,C.customerid from login L,customer1 C where username='"+username+"'and password='"+password+"'and usertype='"+usertype+"'");
		return rs;
	}

	public int RegisterUser(String firstname, String lastname, String sex,String address, String city, String email, Long phon,String dateofbirth, Long pincode, String username,
			String password, String securityquestion, String answer)throws SQLException,ClassNotFoundException
			{
		System.out.println(firstname+lastname+sex);
		try{
			//String sql="insert into Login values(login_seq.nextval,'"+username+"','"+password+"','user','notapproved')";
			//System.out.println(sql);
			int i=dbconnect.getStatement().executeUpdate("insert into Login values(login_seq.nextval,'"+username+"','"+password+"','user','notapproved','"+securityquestion+"','"+answer+"')");
			System.out.println("pppp"+i);
			//String sql1="insert into Customer1 values(CUSTOMER1_SEQ.nextval,'"+firstname+"','"+lastname+"','"+sex+"','"+address+"','"+ city+"','"+email+"',"+phon+",'"+dateofbirth+"',"+pincode+",LOGIN_SEQ.nextval-1)";
			//System.out.println(sql1);
			int j=dbconnect.getStatement().executeUpdate("insert into Customer1 values(CUSTOMER1_SEQ.nextval,'"+firstname+"','"+lastname+"','"+sex+"','"+address+"','"+ city+"','"+email+"',"+phon+",'"+dateofbirth+"',"+pincode+",LOGIN_SEQ.nextval-1)");
			System.out.println("oooo"+j);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return 0;
	}


	public int RegisterCompany(String companyname,String dateofregd, String address, String city,
			String state, String officeno, String email, String faxno,
			String website, String username, String password,
			String securityquestion, String answer)throws SQLException,ClassNotFoundException {

		try{
			
			int i=dbconnect.getStatement().executeUpdate("insert into Login values(LOGIN_SEQ.nextval,'"+username+"','"+password+"','company','notapproved','"+securityquestion+"','"+answer+"')");
			
			int j=dbconnect.getStatement().executeUpdate("insert into Company1 values(COMPANY1_SEQ.nextval,'"+companyname+"','"+address+"','"+city+"','"+state+"','"+ officeno+"','"+email+"','"+faxno+"','"+website+"',LOGIN_SEQ.nextval-1)");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		return 0;
	}

	

	public ResultSet RetCompany()throws SQLException,ClassNotFoundException
	{
		rs=dbconnect.getStatement().executeQuery("select * from login where usertype='company'");
		 
		return rs;
	}

	public int approvecom(Long id)throws SQLException,ClassNotFoundException
	{
		int i=dbconnect.getStatement().executeUpdate("update login set userstatus='approved' where loginid="+id+"");	
		return i;
	}

	public int rejectcom(Long id)throws SQLException,ClassNotFoundException
	{
		
		int i=dbconnect.getStatement().executeUpdate("delete from login where loginid="+id+"");	
		return i;
	}

	public ResultSet RetCustomer()throws SQLException,ClassNotFoundException
	{

		rs=dbconnect.getStatement().executeQuery("select * from login where usertype='user'");
		return rs;
	}

	public int approvecust(Long id)throws SQLException,ClassNotFoundException
	{
		System.out.println("dddddd"+id);
		int i=dbconnect.getStatement().executeUpdate("update login set USERSTATUS='approved' where LOGINID="+id+"");	
		return i;
	}

	public int rejectcust(Long id)throws SQLException,ClassNotFoundException
	{
		int i=dbconnect.getStatement().executeUpdate("delete from login where loginid="+id+"");	
		return i;
	}

	public ResultSet RetBroker()throws SQLException,ClassNotFoundException
	{
		rs=dbconnect.getStatement().executeQuery("select * from login where usertype='broker'");
		return rs;
	}

	public int approvebroker(Long id)throws SQLException,ClassNotFoundException
	{
		int i=dbconnect.getStatement().executeUpdate("update login set userstatus='approved' where loginid="+id+"");	
		return i;
	}

	public int rejectbroker(Long id)throws SQLException,ClassNotFoundException
	{
		int i=dbconnect.getStatement().executeUpdate("delete from login where loginid="+id+"");	
		return i;
	}

	public ResultSet Selectcompany(Long companyid) throws SQLException,ClassNotFoundException
	{
		Long id=companyid;
		System.out.println(id);
		rs=dbconnect.getStatement().executeQuery("select l.loginid,l.username,c.companyname,c.state,c.website,c.email,c.faxno from login l,company1 c where l.loginid=c.loginid and l.loginid="+id+"");
		System.out.println(id);
		return rs;
	}

	public ResultSet Selectbroker(Long loginid)throws SQLException,ClassNotFoundException
	{
		
		Long id=loginid;
		System.out.println(id);
		rs=dbconnect.getStatement().executeQuery("select l.loginid,b.firstname,b.sex,b.dmateid,b.email,b.acno from login l,broker1 b where l.loginid=b.loginid and l.loginid="+id+"");
		System.out.println(id);
		return rs;
	}

	public ResultSet Selectcustomer(Long customerid)throws SQLException,ClassNotFoundException {
		Long id=customerid;
		System.out.println(id);
		rs=dbconnect.getStatement().executeQuery("select l.loginid,d.firstname,d.sex,d.address,d.email,d.phone from login l,customer1 d where l.loginid=d.loginid and l.loginid="+id+"");
		System.out.println(id);
		return rs;
	}

	public ResultSet Deletecompany(Long companyid)throws SQLException,ClassNotFoundException {
		
		Long id=companyid;
		System.out.println(id);
		rs=dbconnect.getStatement().executeQuery("select * from login l,company1 d where l.loginid=d.loginid and l.loginid="+id+"");
		System.out.println(id);
		return rs;
	}

	public int delcomp(Long id)throws SQLException,ClassNotFoundException {
	
		int i=dbconnect.getStatement().executeUpdate("delete from company1 where loginid="+id+"");	
		return i;
	}

	public ResultSet Editcompany(Long id)throws SQLException,ClassNotFoundException
	{
	
		String sql="select l.loginid,c.companyname,c.address,c.city,c.state,c.officeno,c.website,c.email,c.faxno from login l,company1 c where l.loginid=c.loginid and l.loginid="+id+"";
		 //System.out.println(sql);
		rs=dbconnect.getStatement().executeQuery(sql);
		return rs;
	}

	public int edit(Long id, String companyname, String address, String city,
			String state, String officeno, String website, String email,
			String faxno)throws SQLException,ClassNotFoundException
			{
		String sql = "update  company1 set companyname='"+companyname+"',address='"+address+"',city='"+city+"',state='"+state+"',officeno='"+officeno+"',website='"+website+"',email='"+email+"',faxno='"+faxno+"'  where loginid="+id+"";
		System.out.println(sql);
		int i=dbconnect.getStatement().executeUpdate(sql);	
		return i;
	}
	public ResultSet showbroker(Long brokerid)throws SQLException,ClassNotFoundException
	{
		Long id=brokerid;
		System.out.println(id);
		rs=dbconnect.getStatement().executeQuery("select * from login l,broker1 d where l.loginid=d.loginid and l.loginid="+id+"");
		System.out.println(id);
		return rs;
	}

	public ResultSet Editbroker(Long loginid)throws SQLException,ClassNotFoundException
	{
		Long id=loginid;
		System.out.println(id+"");
		rs=dbconnect.getStatement().executeQuery("select * from login l,broker1 d where l.loginid=d.loginid and l.loginid="+id+"");
		System.out.println(id);
		return rs;
	}

	public int editbrok( String firstname, String lastname,
			String sex, String address, String dmateid, String acno,
			String email, Long phon,Long loginid)throws SQLException,ClassNotFoundException{
		String sql="update  broker1 set firstname='"+firstname+"',lastname='"+lastname+"',sex='"+sex+"',address='"+address+"',dmateid='"+dmateid+"',acno='"+acno+"',email='"+email+"',phon="+phon+"  where loginid="+loginid+"";
		System.out.println(sql);
		int i=dbconnect.getStatement().executeUpdate(sql);	
		return i;

	}

	public ResultSet Deletebroker(Long brokerid)throws SQLException,ClassNotFoundException {
		
		Long id=brokerid;
		System.out.println(id);
		rs=dbconnect.getStatement().executeQuery("select * from login l,broker1 d where l.loginid=d.loginid and l.loginid="+id+"");
		System.out.println(id);
		return rs;
	}

	public int delbrok(Long id)throws SQLException,ClassNotFoundException {
	
		int i=dbconnect.getStatement().executeUpdate("delete from broker1 where loginid="+id+"");	
		int j=dbconnect.getStatement().executeUpdate("delete from login where loginid="+id+"");	
		return i;
	}

	public ResultSet Tip()throws SQLException,ClassNotFoundException {
		rs=dbconnect.getStatement().executeQuery("select * from tips");
		return rs;
	}

	public int RegisterTips(String tips)throws SQLException,ClassNotFoundException
	{
		int i=dbconnect.getStatement().executeUpdate("insert into Tips values('"+tips+"')");		 
		return 0;
	}


	public ResultSet company(Long loginid)throws SQLException,ClassNotFoundException
	{
	
		System.out.println("not");
		String sql="select l.loginid,c.companyname,c.compnyid from login l,company1 c where l.loginid=c.loginid and l.loginid="+loginid+"";
		System.out.println(sql);
		rs=dbconnect.getStatement().executeQuery(sql);
		return rs;
	}

	public int RegisterBroker(String firstname, String lastname,
			String username, String password, String sex, String address,
			Long phon, String acno, Long balance, String email, String dmateid,
			String securityquestion, String answer, String experience)throws SQLException,ClassNotFoundException
			{try{
				int i=dbconnect.getStatement().executeUpdate("insert into Login values(LOGIN_SEQ.nextval,'"+username+"','"+password+"','broker','notapproved','"+securityquestion+"','"+answer+"')");
				System.out.print("8");
				int j=dbconnect.getStatement().executeUpdate("insert into BROKER1 values(BROKER1_SEQ.nextval,'"+firstname+"','"+lastname+"','"+sex+"','"+dmateid+"','"+acno+"','"+email+"',"+phon+",LOGIN_SEQ.nextval-1,'"+address+"','"+experience+"',"+balance+")");
			     System.out.print("0");
			     int k=dbconnect.getStatement().executeUpdate("insert into BROKERACCOUNT values('"+acno+"',"+balance+",BROKER1_SEQ.nextval-1)");
			     
			     
			}
			
			
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			return 0;
	}

	public int RegisterShare(String companyname,Long companyid, Long noofshare,String shareamount, Long shareprice, String dateoftrans)throws SQLException,ClassNotFoundException
			{
		String sql="insert into Share1 values("+companyid+","+noofshare+","+shareprice+",'"+ dateoftrans+"','"+shareamount+"','"+companyname+"')";
		    System.out.println(sql);
			int j=dbconnect.getStatement().executeUpdate(sql);
			return j;
	}

	public ResultSet Editshare(Long loginid) throws SQLException,ClassNotFoundException
			{
		String sql="select c.compnyid,c.companyname,s.noofshare,s.SHAREINDEX,s.shareprice from share1 s,company1 c where s.compnyid=c.compnyid and c.compnyid=(select c.compnyid from company1 c, login l where l.loginid=c.loginid  and l.loginid="+loginid+")";
		    System.out.println(sql);
		    rs=dbconnect.getStatement().executeQuery(sql);
		    System.out.println(123);
			return rs;
	}

	public int editshare(Long companyid,String companyname, String shareamount,Long noofshare, Long shareprice)throws SQLException,ClassNotFoundException
			{
		System.out.println(companyid+"  "+companyname+" "+shareamount+" "+shareamount+" "+noofshare+" "+shareprice);
		String sql1="update  share1 set SHAREINDEX='"+shareamount+"',noofshare="+noofshare+",shareprice="+shareprice+" where compnyid='"+companyid+"'";
		    System.out.println(sql1);
			int j=dbconnect.getStatement().executeUpdate(sql1);
			return j;
	}

	public ResultSet viewshare()throws SQLException,ClassNotFoundException
	{
		String sql="select * from share1";
		System.out.println(sql+" ");
		rs=dbconnect.getStatement().executeQuery(sql);
		return rs;
	}

	public ResultSet Selectcustomer1(Long loginid)throws SQLException,ClassNotFoundException
	{
		Long id=loginid;
		System.out.println(id);
		rs=dbconnect.getStatement().executeQuery("select * from login l,customer1 d where l.loginid=d.loginid and l.loginid="+id+"");
		System.out.println(id);
		return rs;
	}

	public int editcust(String firstname, String lastname, String sex,String address, String city, String dateofbirth, Long pincode,String email, Long phon,Long loginid)throws SQLException,ClassNotFoundException
			{
		String sql1="update  customer1 set FIRSTNAME='"+firstname+"',LASTNAME='"+lastname+"',SEX='"+sex+"',ADDRESS='"+address+"',CITY='"+city+"',EMAIL='"+email+"',PHONE="+phon+",PINCODE="+pincode+" where loginid="+loginid+"";
		    System.out.println(sql1);
			int j=dbconnect.getStatement().executeUpdate(sql1);
			return j;
	}

	public ResultSet viewshare1(Long loginid) throws SQLException,ClassNotFoundException
			{
		System.out.println(loginid);
		/*ResultSet rs1=dbconnect.getStatement().executeQuery("select COMPNYID from company1 where loginid="+loginid+"");
		if(rs1.next())
		{
			Long id=rs.getLong(1);
		}*/
		String sql="select c.compnyid,c.companyname,s.noofshare,s.SHAREINDEX,s.shareprice from share1 s,company1 c,login l where s.compnyid=c.compnyid and l.loginid=c.loginid and  c.compnyid="+loginid+"";
		    System.out.println(sql);
		    rs=dbconnect.getStatement().executeQuery(sql);
		    System.out.println(123);
			return rs;
	
	        }

	public int feedback(String subject,String enterurcomment, String dateofpost, Long loginid,
			String user)throws SQLException,ClassNotFoundException
			{
		try{
			System.out.println(subject+enterurcomment+dateofpost+loginid+user);
				//int i=dbconnect.getStatement().executeUpdate("insert into Login values(LOGIN_SEQ.nextval,'"+username+"','"+password+"','broker','notapproved')");
				//System.out.print("8");
				int j=dbconnect.getStatement().executeUpdate("insert into FEEDBACK values(FEEDBACK_SEQ.nextval,'"+subject+"','"+enterurcomment+"','"+dateofpost+"', "+loginid+",'"+user+"','"+null+"')");
				System.out.print("0");
			}
			
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			return 0;
	}

	public ResultSet viewfdbck( String usertype) throws SQLException,ClassNotFoundException
	{
		
		//System.out.println(loginid);
		String sql="select loginid,dop,subject from feedback where  usertype='"+usertype+"'";
		System.out.println(sql);
		rs=dbconnect.getStatement().executeQuery(sql);
		//System.out.println(loginid+"dddd"); 
		return rs;
	}

	public ResultSet viewfb(Long id) throws SQLException,ClassNotFoundException
	{
		
		System.out.println(id);
		String sql="select detail from feedback where  loginid="+id+"";
		System.out.println(sql);
		rs=dbconnect.getStatement().executeQuery(sql);
		//System.out.println(loginid+"dddd"); 
		return rs;
	}

	public int replyfb(Long id,String reply)  throws SQLException,ClassNotFoundException
	{
		
		System.out.println(id);
		String sql="update feedback set reply='"+reply+"' where loginid="+id+" ";
		System.out.println(sql);
		int i=dbconnect.getStatement().executeUpdate(sql);
		//System.out.println(loginid+"dddd"); 
		return i ;
	}



	public ResultSet Recomp() throws Exception {
		
		ResultSet	rs=dbconnect.getStatement().executeQuery("select c.compnyid,c.companyname  from company1 c,login l where l.loginid=c.loginid and l.USERSTATUS='approved'");
		return rs;
		
	}

	public ResultSet Tran(Long idd) throws Exception{

		ResultSet	rs=dbconnect.getStatement().executeQuery("select c.customerid,c.firstname,c.lastname,d.CDEMATEID,b.brokerid,b.FIRSTNAME,b.LASTNAME from CUSTOMER1 c,DETAILS d,login l,broker1 b where l.loginid=c.loginid  and  c.CUSTOMERID=d.CUSTOMERID and d.brokerid=b.brokerid and l.loginid="+idd+"");
return rs;
	}

	public int Registerbrokdetails( String bankname,
			String branchname, Long cacno, Long cbalance, Long idd,Long id)throws SQLException,ClassNotFoundException
	{
		String sql="insert into DETAILS values(DETAILS_SEQ.nextval,'"+bankname+"','"+branchname+"',"+cacno+","+cbalance+","+idd+","+id+")";
		String sql1="insert into CUSTACCOUNT values("+idd+","+cbalance+","+cacno+")";
		System.out.println(sql1);
		System.out.println(sql);
		int i=dbconnect.getStatement().executeUpdate(sql);		 
		int j=dbconnect.getStatement().executeUpdate(sql1);		 
		return 0;
	}

	public ResultSet returnAccno(Long user_id)throws Exception {
		
		ResultSet	rs=dbconnect.getStatement().executeQuery("select ACNO from DETAILS where CUSTOMERID="+user_id+"");
		return rs;
	}    

	
	public ResultSet ret(Long idd, String dt) throws Exception {
		
		System.out.println(idd+dt);
		ResultSet	rs=dbconnect.getStatement().executeQuery("select SHAREPRICE from SHARE1 where COMPNYID="+idd+" and DATEOFTRANS='"+dt+"'");
		return rs;        
	}
	public ResultSet retBalance(Long accno) throws Exception {
		
		ResultSet	rs=dbconnect.getStatement().executeQuery("select BALANCE from CUSTACCOUNT where ACNO="+accno+"");
		return rs;
	}
	public ResultSet retrivecompname(Long companyid)throws Exception {
		
		ResultSet	rs=dbconnect.getStatement().executeQuery("select COMPANYNAME from COMPANY1 where COMPNYID="+companyid+"");
		return rs;
	}

	public ResultSet RSCompany()throws SQLException,ClassNotFoundException
	{
		rs=dbconnect.getStatement().executeQuery("select * from company1");
		 
		return rs;
	}
	public ResultSet returnbroaccount(Long broker_id) throws Exception{
		System.out.println("34567ooooo"+broker_id);
		
		ResultSet	rs=dbconnect.getStatement().executeQuery("select ACNO from broker1 where brokerid="+broker_id+"");
		return rs;
	}
	public ResultSet returnAccount(Long cdematid)throws Exception {
		System.out.println("ddddd"+cdematid);
		ResultSet	rs=dbconnect.getStatement().executeQuery("select ACNO from DETAILS where CDEMATEID="+cdematid+"");
		return rs;
	}
	public int baldown(double newbalance, Long accountno, Long broaccno, Double bramt) throws Exception{
		
		int j=dbconnect.getStatement().executeUpdate("update CUSTACCOUNT set  balance="+newbalance+" where ACNO="+accountno+"");
		System.out.println(234567+"   "+bramt);
		String sql="update BROKERACCOUNT set  balance="+bramt+" where ACNO="+broaccno+"";
		int i=dbconnect.getStatement().executeUpdate("update BROKERACCOUNT set  balance="+bramt+" where ACNO="+broaccno+"");
		int l=dbconnect.getStatement().executeUpdate("update BROKER1 set  balance="+bramt+" where ACNO="+broaccno+"");
		
		System.out.println("sql="+sql);
		int k=dbconnect.getStatement().executeUpdate("update details set   balance="+newbalance+" where ACNO="+accountno+"");
		return i;
	}
	

public int sharedown(Long comp_id, Long no_share)throws Exception {
		
		int i,j = 0,k = 0;
		java.util.Date d=new java.util.Date();
		SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yy");
		String s1=sd.format(d);
		System.out.println("xxxxx"+comp_id);
		i=dbconnect.getStatement().executeUpdate("update SHARE1 set NOOFSHARE=NOOFSHARE-"+no_share+" where COMPNYID="+comp_id+" and DATEOFTRANS='"+s1+"'");
	ResultSet	rs=dbconnect.getStatement().executeQuery("select * from moreshare where types='bought' and DATEOFTRANS='"+s1+"'");
		if(rs.next()==true)
		{
			k=dbconnect.getStatement().executeUpdate("update moreshare set NOOFSHARE=NOOFSHARE+"+no_share+" where COMPNYID="+comp_id+" and types='bought' and DATEOFTRANS='"+s1+"'");
		}
		else
		{
			j=dbconnect.getStatement().executeUpdate("insert into moreshare values("+comp_id+","+no_share+",'bought','"+s1+"')");	
		}
		
		System.out.println("k value"+k+"and j value"+j);
	return i;
	
	}
	public int TransBuy(Long user_id,Long comp_id,Long newbalance,Double amount)throws SQLException {
	
		java.util.Date d=new java.util.Date();
		SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yy");
		String sdate=sd.format(d);
		ResultSet rs1=dbconnect.getStatement().executeQuery("select * from transaction where type='purchase' and bywhom='self' and COMPNYID="+comp_id+" and DATEOFTRANS='"+sdate+"' and CUSTOMERID="+user_id+"");
		if(rs1.next()==true)
		{
			String sql2="update transaction set AMOUNT=AMOUNT+"+amount+",SHAREAMOUNT=SHAREAMOUNT+"+newbalance+" where type='purchase' and bywhom='self' and COMPNYID="+comp_id+" and DATEOFTRANS='"+sdate+"' and CUSTOMERID="+user_id+" ";
			System.out.println(sql2+"  ");
			int l=dbconnect.getStatement().executeUpdate("update transaction set AMOUNT=AMOUNT+"+amount+",SHAREAMOUNT=SHAREAMOUNT+"+newbalance+" where type='purchase' and bywhom='self' and COMPNYID="+comp_id+" and DATEOFTRANS='"+sdate+"' and CUSTOMERID="+user_id+" ");
		}
		else
		{
			int i=dbconnect.getStatement().executeUpdate("Insert into transaction values(TRANS_SEQ.nextval,"+user_id+",'"+sdate+"',"+amount+",'purchase','self',"+comp_id+","+newbalance+")");
            String sql="update SHARE1 set NOOFSHARE=NOOFSHARE-"+newbalance+" where COMPNYID="+comp_id+" ";
            System.out.println("kkkkk"+sql);
			int k=dbconnect.getStatement().executeUpdate("update SHARE1 set NOOFSHARE=NOOFSHARE-"+newbalance+" where COMPNYID="+comp_id+" "); 
		}
		String ss="select * from FINALALLOCATION where CUSTOMERID="+user_id+" and COMPNYID="+comp_id+" ";
		System.out.println(ss+"  "+"           sql");
		ResultSet rss=dbconnect.getStatement().executeQuery("select * from FINALALLOCATION where CUSTOMERID="+user_id+" and COMPNYID="+comp_id+" ");
		if(rss.next()==true)
		{
			int j=dbconnect.getStatement().executeUpdate("update FINALALLOCATION set noofshare=noofshare+"+newbalance+" where CUSTOMERID="+user_id+" and COMPNYID="+comp_id+" ");	
		}
		else
		{
			int k=dbconnect.getStatement().executeUpdate("insert into FINALALLOCATION values("+user_id+","+comp_id+","+newbalance+")");
		}
		return 1;
	}

	public ResultSet returnbbalance(Long brokerid) throws Exception{
		
		ResultSet	rs=dbconnect.getStatement().executeQuery("select BALANCE from BROKERACCOUNT where brokerid="+brokerid+"");
		return rs;
	}

	public ResultSet retrivecompname(String companyname)throws Exception {
		
		ResultSet	rs=dbconnect.getStatement().executeQuery("select COMPANYNAME from company1 where COMPNYID='"+companyname+"'");
		return rs;
	}public int balup(double newbalance, Long accountno, Long broaccno, Double bramt) throws Exception{

		int j=dbconnect.getStatement().executeUpdate("update CUSTACCOUNT set  balance="+newbalance+" where ACNO="+accountno+"");
		int i=dbconnect.getStatement().executeUpdate("update BROKERACCOUNT set  balance="+bramt+" where ACNO="+broaccno+"");
		return i;
	}
	public int sharup(Long comp_id, Long no_share)throws Exception {
		
		int i,j = 0,k = 0;
		java.util.Date d=new java.util.Date();
		SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yy");
		String s1=sd.format(d);
		i=dbconnect.getStatement().executeUpdate("update share1 set NOOFSHARE=NOOFSHARE+"+no_share+" where COMPNYID="+comp_id+" and DATEOFTRANS='"+s1+"'");
	ResultSet	rs=dbconnect.getStatement().executeQuery("select * from moreshare where types='sold' and DATEOFTRANS='"+s1+"'");
		if(rs.next()==true)
		{
			k=dbconnect.getStatement().executeUpdate("update moreshare set NOOFSHARE=NOOFSHARE+"+no_share+" where COMPNYID="+comp_id+" and types='sold' and DATEOFTRANS='"+s1+"'");
		}
		else
		{
			j=dbconnect.getStatement().executeUpdate("insert into moreshare values("+comp_id+","+no_share+",'sold','"+s1+"')");	
		}
		
		System.out.println("k value"+k+"and j value"+j);
	return i;
	}
	public int TransSale(Long user_id,Long comp_id,Long newbalance,Long amount)throws Exception {
		
		java.util.Date d=new java.util.Date();
		SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yy");
		String sdate=sd.format(d);
		ResultSet rs1=dbconnect.getStatement().executeQuery("select * from TRANSACTION where type='sale' and bywhom='self' and COMPNYID="+comp_id+" and DATEOFTRANS='"+sdate+"' and CUSTOMERID="+user_id+"");
		if(rs1.next()==true)
		{
			int l=dbconnect.getStatement().executeUpdate("update TRANSACTION set amount=amount+"+amount+",SHAREAMOUNT=SHAREAMOUNT+"+newbalance+" where type='sale' and bywhom='self' and COMPNYID="+comp_id+" and DATEOFTRANS='"+sdate+"' and CUSTOMERID="+user_id+" ");
		}
		else
		{
			int i=dbconnect.getStatement().executeUpdate("Insert into TRANSACTION values(trans_seq.nextval,"+user_id+",'"+sdate+"',"+amount+",'sale','self',"+comp_id+","+newbalance+")");

		}
			ResultSet rss=dbconnect.getStatement().executeQuery("select * from FINALALLOCATION where CUSTOMERID="+user_id+" and COMPNYID="+comp_id+" ");
		if(rss.next()==true)
		{
			int j=dbconnect.getStatement().executeUpdate("update FINALALLOCATION set NOOFSHARE=NOOFSHARE-"+newbalance+" where CUSTOMERID="+user_id+" and COMPNYID="+comp_id+" ");	
		}
		
		return 1;
	}
	public ResultSet Rebrokerr() throws Exception{
		
		ResultSet rs=dbconnect.getStatement().executeQuery("select b.brokerid,b.firstname,b.lastname from broker1 b,login l where l.loginid=b.loginid and l.USERSTATUS='approved'");
		return rs;
	}

	public ResultSet Trans(Long user_id) throws Exception{
		System.out.println("qqqqqq"+user_id);
		ResultSet	rs=dbconnect.getStatement().executeQuery("select c.CUSTOMERID,c.firstname,c.lastname,cd.CDEMATEID from customer1 c,DETAILS cd,login l where l.loginid=c.loginid and c.CUSTOMERID=cd.CUSTOMERID and l.loginid="+user_id+"");
		return rs;
	}

	public ResultSet getCompany(Long idd)throws Exception {
		rs=dbconnect.getStatement().executeQuery("select COMPANYNAME from company1 where companyid="+idd+"");
		return rs;
	}

	public int bybrok(Long customerid, Long brokerid, Long companyname,
			Long noofshare, String type)throws Exception {
		int i=dbconnect.getStatement().executeUpdate("insert into REQUESTED values(REQUEST_SEQ.nextval,"+brokerid+","+customerid+","+companyname+","+noofshare+",'not processed','no transaction','"+type+"')");
		return i;
	}

	public ResultSet Share(Long user_id)throws Exception {
		String sql="select c.COMPANYNAME,t.SHAREAMOUNT,t.AMOUNT,t.DATEOFTRANS,t.type,t.bywhom from company1 c,TRANSACTION t,login l,customer1 cu where c.COMPNYID=t.COMPNYID and l.loginid=cu.loginid and cu.CUSTOMERID=t.CUSTOMERID and l.loginid="+user_id+" order by t.dateoftrans";
		System.out.println(sql+"wwwwwwww");
		ResultSet	rs=dbconnect.getStatement().executeQuery(sql);
		return rs;
	}
	public ResultSet reqdetail(Long idd) throws Exception{
		String sql="select c.COMPANYNAME,r.SHAREAMOUNT,b.firstname,b.lastname,r.status,r.remark,r.want from company1 c,requested r,login l,customer1 cu,broker1 b where c.COMPNYID=r.COMPNYID and b.brokerid=r.brokerid and l.loginid=cu.loginid and cu.CUSTOMERID=r.CUSTOMERID and cu.loginid="+idd+"";
		System.out.println(sql+"pppppppp");
		ResultSet	rs=dbconnect.getStatement().executeQuery(sql);
		return rs;
	}
	public ResultSet seerequest(Long idd) throws Exception{
		System.out.println("aaaaaaaa"+idd);
		String sql="select r.REQ_ID,r.BROKERID,r.CUSTOMERID,c.COMPNYID,r.SHAREAMOUNT,r.WANT,cu.firstname,cu.lastname,c.COMPANYNAME from requested r,customer1 cu,company1 c,broker1 b,login l where l.loginid=b.loginid and r.CUSTOMERID=cu.CUSTOMERID and b.brokerid=r.brokerid and r.want='sale' and c.COMPNYID=r.COMPNYID  and l.loginid="+idd+"";
		System.out.println(sql+"gggggggggggggg");
			ResultSet	rs=dbconnect.getStatement().executeQuery(sql);
			return rs;
		}
public ResultSet retriveinform(Long brokerId) throws Exception{
		
		ResultSet	rs=dbconnect.getStatement().executeQuery("select DMATEID,	ACNO from broker1 where BROKERID="+brokerId+"");
		return rs;
	}
	
 
public ResultSet seerequest1(Long idd) throws Exception
{
			System.out.println("aaaaaaaa"+idd);
			String sql="select r.REQ_ID,r.BROKERID,r.CUSTOMERID,c.COMPNYID,r.SHAREAMOUNT,r.WANT,cu.firstname,cu.lastname,c.COMPANYNAME from requested r,customer1 cu,company1 c,broker1 b,login l where l.loginid=b.loginid and r.CUSTOMERID=cu.CUSTOMERID and b.brokerid=r.brokerid and r.want='purchase' and c.COMPNYID=r.COMPNYID  and l.loginid="+idd+"";
			System.out.println(sql+"gggggggggggggg");
				ResultSet	rs=dbconnect.getStatement().executeQuery(sql);
				return rs;
			}
	
public int TransBroBuy(Long userid,Long compid,Long newbalance,Long amount)throws SQLException {
	
	java.util.Date d=new java.util.Date();
	SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yy");
	String sdate=sd.format(d);
	ResultSet rs1=dbconnect.getStatement().executeQuery("select * from transaction where type='purchase' and bywhom='broker' and COMPNYID="+compid+" and DATEOFTRANS='"+sdate+"' and CUSTOMERID="+userid+"");
	if(rs1.next()==true)
	{
		int l=dbconnect.getStatement().executeUpdate("update transaction set amount=amount+"+amount+",SHAREAMOUNT=SHAREAMOUNT+"+newbalance+" where type='purchase' and bywhom='broker' and COMPNYID="+compid+" and DATEOFTRANS='"+sdate+"' and CUSTOMERID="+userid+" ");
	}
	else
	{
		int i=dbconnect.getStatement().executeUpdate("Insert into transaction values(trans_seq.nextval,"+userid+",'"+sdate+"',"+amount+",'purchase','broker',"+compid+","+newbalance+")");

	}
		ResultSet rss=dbconnect.getStatement().executeQuery("select * from FINALALLOCATION where CUSTOMERID="+userid+" and COMPNYID="+compid+" ");
	if(rss.next()==true)
	{
		int j=dbconnect.getStatement().executeUpdate("update FINALALLOCATION set noofshare=noofshare+"+newbalance+" where CUSTOMERID="+userid+" and COMPNYID="+compid+" ");	
	}
	else
	{
		int k=dbconnect.getStatement().executeUpdate("insert into FINALALLOCATION values("+userid+","+compid+","+newbalance+")");
	}
	return 1;
}
public ResultSet viewownshr1(long l2) throws SQLException,ClassNotFoundException
{
	String sql="select COMPANYNAME from COMPANY1  where COMPNYID="+l2+"";
	    System.out.println(sql);
	    rs=dbconnect.getStatement().executeQuery(sql);
	    System.out.println(123);
		return rs;

        }

public ResultSet forgtpsw(String username, String securityquestion,
		String answer, String us) throws SQLException,ClassNotFoundException{
	
	if(us=="user")
	{
	
	ResultSet	rs=dbconnect.getStatement().executeQuery("select USERNAME,SECRUITY_QUESTION,ANSWER from login where USERNAME='"+username+"' and SECRUITY_QUESTION='"+securityquestion+"' and ANSWER='"+answer+"' ");
	return rs;
	}
	else if(us=="broker")
	{
		ResultSet	rs=dbconnect.getStatement().executeQuery("select USERNAME,SECRUITY_QUESTION,ANSWER from login where USERNAME='"+username+"' and SECRUITY_QUESTION='"+securityquestion+"' and ANSWER='"+answer+"' ");	
		return rs;
	}
	else
	{
		ResultSet	rs=dbconnect.getStatement().executeQuery("select USERNAME,SECRUITY_QUESTION,ANSWER from login where USERNAME='"+username+"' and SECRUITY_QUESTION='"+securityquestion+"' and ANSWER='"+answer+"' ");	
		return rs;
	}


	//return rs;
}

public int confmpsw(String username, String usertype,String npassword)throws SQLException,ClassNotFoundException{
	if(usertype=="user")
	{
		String sql="update CUSTOMER1 set PASSWORD='"+npassword+"' where USERNAME='"+username+"'";
		System.out.println(sql+"jjjjjjjjjjjjjjj");
		
	//int i=dbconnect.getStatement().executeUpdate("update CUSTOMER1 set PASSWORD='"+npassword+"' where USERNAME='"+username+"'");
		
	int j=dbconnect.getStatement().executeUpdate("update login set PASSWORD='"+npassword+"' where USERNAME='"+username+"' and USERTYPE='"+usertype+"'");
	}
	else if(usertype=="broker")
	{
		//int k=dbconnect.getStatement().executeUpdate("update BROKER1 set PASSWORD='"+npassword+"' where USERNAME='"+username+"'");
		
		int l=dbconnect.getStatement().executeUpdate("update login set PASSWORD='"+npassword+"' where USERNAME='"+username+"' and USERTYPE='"+usertype+"'");	
	}
	else
	{
		//int i=dbconnect.getStatement().executeUpdate("update COMPANY1 set PASSWORD='"+npassword+"' where USERNAME='"+username+"'");
		
		int j=dbconnect.getStatement().executeUpdate("update login set PASSWORD='"+npassword+"' where USERNAME='"+username+"' and USERTYPE='"+usertype+"'");	

	}
	
	return 2;
}

public ResultSet combocomp()throws Exception {
	rs=dbconnect.getStatement().executeQuery("select * from COMPANY1");
	return rs;
}

public ResultSet selectcompny()throws Exception {
	rs=dbconnect.getStatement().executeQuery("select * from broker1");
	return rs;
}

public ResultSet Deletecustomer(Long loginid)throws Exception {
	rs=dbconnect.getStatement().executeQuery("select * from customer1 where 	LOGINID="+loginid+"");
	return rs;
}

public int delcust(Long id)throws Exception {
	
	int  z=dbconnect.getStatement().executeUpdate("delete from login where loginid="+id+"");
	int j=dbconnect.getStatement().executeUpdate("delete from customer1 where loginid="+id+"");
	return z;
}

}
