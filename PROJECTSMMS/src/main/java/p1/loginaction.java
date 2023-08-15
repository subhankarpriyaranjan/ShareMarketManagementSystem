
package p1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class loginaction extends ActionSupport implements ServletRequestAware {

	private static final long serialVersionUID = 1L;
	HttpServletRequest request;
	private String username;
	private String password;
	private String usertype;
	private String email;
	private String usertype1;
	private Long reqid;
	private Long saleshare;
	private double broamount;
	private String choosebroker;
	private String choosecompany;
	private String city;
	private String brokername;
	private String dateofregd;
	private String sex;
	private String enterurcomment;
	private String address;
	private String dateofpost;
	private String dmateid;
	private String acno;
	private Long balance;
	private String firstname;
	private Long phon;
	private Long noshare;
	private Long avlshare;
	private Long amtdeposited;
	private String lastname;
	private String securityquestion;
	private String answer;
	private String msg;
	private String experience;
	private String customername;

	private String trantype;
	private String companyname;
	private String state;
	private String officeno;
	private String faxno;
	private String website;
	private String shareamount;
	private String dateofbirth;
	private Long id;
	ArrayList<loginaction> alist;
	private Long noofshare;
	private Long shareprice;
	private String dateoftrans;
	private String level;
	private String detail;
	private Long cdemateid;
	private String bankname;
	private String branchname;
	private Long cacno;
	private Long cbalance;
	private String bywhom;
	private String want;

	public String getUsertype1() {
		return usertype1;
	}

	public void setUsertype1(String usertype1) {
		this.usertype1 = usertype1;
	}

	public Long getSaleshare() {
		return saleshare;
	}

	public void setSaleshare(Long saleshare) {
		this.saleshare = saleshare;
	}

	public double getBroamount() {
		return broamount;
	}

	public void setBroamount(double broamount) {
		this.broamount = broamount;
	}

	public Long getNoshare() {
		return noshare;
	}

	public void setNoshare(Long noshare) {
		this.noshare = noshare;
	}

	public String getBywhom() {
		return bywhom;
	}

	public void setBywhom(String bywhom) {
		this.bywhom = bywhom;
	}

	public ArrayList<loginaction> getAlist() {
		return alist;
	}

	public void setAlist(ArrayList<loginaction> alist) {
		this.alist = alist;
	}

	public Long getAvlshare() {
		return avlshare;
	}

	public void setAvlshare(Long avlshare) {
		this.avlshare = avlshare;
	}

	public Long getAmtdeposited() {
		return amtdeposited;
	}

	public Long getReqid() {
		return reqid;
	}

	public void setReqid(Long reqid) {
		this.reqid = reqid;
	}

	public void setAmtdeposited(Long amtdeposited) {
		this.amtdeposited = amtdeposited;
	}

	public Long getCdemateid() {
		return cdemateid;
	}

	public void setCdemateid(Long cdemateid) {
		this.cdemateid = cdemateid;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;

	}

	public Double getPresentamt() {
		return presentamt;
	}

	public void setPresentamt(Double presentamt) {
		this.presentamt = presentamt;
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	public Long getCacno() {
		return cacno;
	}

	public void setCacno(Long cacno) {
		this.cacno = cacno;
	}

	public Long getCbalance() {
		return cbalance;
	}

	public void setCbalance(Long cbalance) {
		this.cbalance = cbalance;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getLevel() {
		return level;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getEnterurcomment() {
		return enterurcomment;
	}

	public void setEnterurcomment(String enterurcomment) {
		this.enterurcomment = enterurcomment;
	}

	public String getDateofpost() {
		return dateofpost;
	}

	public void setDateofpost(String dateofpost) {
		this.dateofpost = dateofpost;
	}

	public Long getNoofshare() {
		return noofshare;
	}

	public void setNoofshare(Long noofshare) {
		this.noofshare = noofshare;
	}

	public Long getBrokerid() {
		return brokerid;
	}

	public void setBrokerid(Long brokerid) {
		this.brokerid = brokerid;
	}

	public Long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}

	public String getDateofregd() {
		return dateofregd;
	}

	public void setDateofregd(String dateofregd) {
		this.dateofregd = dateofregd;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	private String type;
	private String reply;
	private Long pincode;

	public Double getAmtdeducted() {
		return amtdeducted;

	}

	public void setAmtdeducted(Double amtdeducted) {
		this.amtdeducted = amtdeducted;
	}

	private String reg;
	private String shareamt;
	private String shareindex;
	private String tips;
	private Long companyid;
	private Long loginid;
	private Long brokerid;
	private Long customerid;
	private Long senderid;
	private String subject;
	private String npassword;
	private String rpassword;
	// private Long dateofpost;
	private Long viewfeedback;
	private Double presentamt;
	private Double amtdeducted;

	public String getNpassword() {
		return npassword;
	}

	public void setNpassword(String npassword) {
		this.npassword = npassword;
	}

	public String getRpassword() {
		return rpassword;
	}

	public void setRpassword(String rpassword) {
		this.rpassword = rpassword;
	}

	public String getWant() {
		return want;
	}

	public void setWant(String want) {
		this.want = want;
	}

	private Double presentamt1;
	private String status;
	private String remark;

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getPresentamt1() {
		return presentamt1;
	}

	public void setPresentamt1(Double presentamt1) {
		this.presentamt1 = presentamt1;
	}

	// private String choosecompany;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getShareprice() {
		return shareprice;
	}

	public void setShareprice(Long shareprice) {
		this.shareprice = shareprice;
	}

	public String getDateoftrans() {
		return dateoftrans;
	}

	public void setDateoftrans(String dateoftrans) {
		this.dateoftrans = dateoftrans;
	}

	public Long getLoginid() {
		return loginid;
	}

	public void setLoginid(Long loginid) {
		this.loginid = loginid;
	}

	private Map<Long, String> mapForSelect;
	private Map<Long, String> mapForSelect1;

	public Map<Long, String> getMapForSelect1() {
		return mapForSelect1;
	}

	public void setMapForSelect1(Map<Long, String> mapForSelect1) {
		this.mapForSelect1 = mapForSelect1;
	}

	private String choosecustomer;

	public Long getCompanyid() {
		return companyid;
	}

	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getChoosebroker() {
		return choosebroker;
	}

	public void setChoosebroker(String choosebroker) {
		this.choosebroker = choosebroker;
	}

	public String getChoosecompany() {
		return choosecompany;
	}

	public void setChoosecompany(String choosecompany) {
		this.choosecompany = choosecompany;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBrokername() {
		return brokername;
	}

	public void setBrokername(String brokername) {
		this.brokername = brokername;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDmateid() {
		return dmateid;
	}

	public void setDmateid(String dmateid) {
		this.dmateid = dmateid;
	}

	public String getAcno() {
		return acno;
	}

	public void setAcno(String acno) {
		this.acno = acno;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Long getPhon() {
		return phon;
	}

	public void setPhon(Long phon) {
		this.phon = phon;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSecurityquestion() {
		return securityquestion;
	}

	public void setSecurityquestion(String securityquestion) {
		this.securityquestion = securityquestion;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getTrantype() {
		return trantype;
	}

	public void setTrantype(String trantype) {
		this.trantype = trantype;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getOfficeno() {
		return officeno;
	}

	public void setOfficeno(String officeno) {
		this.officeno = officeno;
	}

	public String getFaxno() {
		return faxno;
	}

	public void setFaxno(String faxno) {
		this.faxno = faxno;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getShareamount() {
		return shareamount;
	}

	public void setShareamount(String shareamount) {
		this.shareamount = shareamount;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	public String getReg() {
		return reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

	public String getShareamt() {
		return shareamt;
	}

	public void setShareamt(String shareamt) {
		this.shareamt = shareamt;
	}

	public String getShareindex() {
		return shareindex;
	}

	public void setShareindex(String shareindex) {
		this.shareindex = shareindex;
	}

	public String getTips() {
		return tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Map<Long, String> getMapForSelect() {
		return mapForSelect;
	}

	public void setMapForSelect(Map<Long, String> mapForSelect) {
		this.mapForSelect = mapForSelect;
	}

	public String getChoosecustomer() {
		return choosecustomer;
	}

	public void setChoosecustomer(String choosecustomer) {
		this.choosecustomer = choosecustomer;
	}

	dblogic dl = new dblogic();

	public String Registeruserdata() throws SQLException, ClassNotFoundException {
		int i = 0;
		System.out.println("first" + firstname);

		i = dl.RegisterUser(getFirstname(), getLastname(), getSex(), getAddress(), getCity(), getEmail(), getPhon(),
				getDateofbirth(), getPincode(), getUsername(), getPassword(), getSecurityquestion(), getAnswer());
		System.out.println(i);
		resetuser();
		setMsg("regester successfully user");
		return "registersuccessuser";

	}

	public String Registercompanydata() throws SQLException, ClassNotFoundException {
		int i = 0;
		i = dl.RegisterCompany(getCompanyname(), getDateofregd(), getAddress(), getCity(), getState(), getOfficeno(),
				getEmail(), getFaxno(), getWebsite(), getUsername(), getPassword(), getSecurityquestion(), getAnswer());
		resetcompany();
		setMsg("regester successfully company");
		return "registersuccesscompany";
	}

	public String Registerbrokerdata() throws SQLException, ClassNotFoundException {
		int i = 0;
		i = dl.RegisterBroker(getFirstname(), getLastname(), getUsername(), getPassword(), getSex(), getAddress(),
				getPhon(), getAcno(), getBalance(), getEmail(), getDmateid(), getSecurityquestion(), getAnswer(),
				getExperience());
		System.out.print("8");
		resetbroker();
		setMsg("regester successfully broker");
		return "registersuccessbroker";
	}

	public String combo1() throws SQLException, ClassNotFoundException {
		System.out.print("enter");

		mapForSelect = new HashMap<Long, String>();
		System.out.print("89");
		ResultSet rs = dl.RetCompany();
		System.out.println("84");

		while (rs.next()) {
			Long s1 = rs.getLong(1);
			System.out.println(s1);
			mapForSelect.put(rs.getLong(1), rs.getString(2));
			System.out.println("83");
		}
		return "confirm";
	}

	public String apprejcom() throws SQLException, ClassNotFoundException {
		ResultSet rs = dl.Selectcompany(getLoginid());
		// System.out.println(getLoginid());
		// loginaction la =new loginaction();
		if (rs.next()) {
			setLoginid(rs.getLong(1));
			setUsername(rs.getString(2));
			setCompanyname(rs.getString(3));
			setState(rs.getString(4));
			setWebsite(rs.getString(5));
			setEmail(rs.getString(6));
			setFaxno(rs.getString(7));

		}
		return "displaycomp";
	}

	public String AppCompany() throws SQLException, ClassNotFoundException {
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext()
				.get("ServletActionContext.HTTP_REQUEST");
		Long id = getId();
		// Long id=Long.parseLong(request.getParameter("id"));
		System.out.print(id);
		int i = dl.approvecom(id);
		if (i > 0) {
			setMsg("approved successfully by admin  ");
			return combo1();
		}
		return null;
	}

	public String RejCompany() throws SQLException, ClassNotFoundException {
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext()
				.get("ServletActionContext.HTTP_REQUEST");
		Long id = getId();// Long.parseLong(request.getParameter("id"));
		int i = dl.rejectcom(id);
		if (i > 0) {
			setMsg("u r rejected   by admin  ");
			return combo1();
		}
		return null;
	}

	public String apprejcust() throws SQLException, ClassNotFoundException {
		ResultSet rs = dl.Selectcustomer(getLoginid());

		// loginaction la =new loginaction();
		if (rs.next()) {
			setLoginid(rs.getLong(1));
			setFirstname(rs.getString(2));
			setSex(rs.getString(3));
			setAddress(rs.getString(4));
			setEmail(rs.getString(5));
			setPhon(rs.getLong(6));

		}
		return "displaycust";
	}

	public String combo3() throws SQLException, ClassNotFoundException {
		{
			mapForSelect = new HashMap<Long, String>();
			ResultSet rs = dl.RetCustomer();
			while (rs.next())
				mapForSelect.put(rs.getLong(1), rs.getString(2));
			return "confirm";
		}
	}

	public String AppCustomer() throws SQLException, ClassNotFoundException {
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext()
				.get("ServletActionContext.HTTP_REQUEST");

		Long id = getId()/* Long.parseLong(request.getParameter("id")) */;
		System.out.print(id);
		int i = dl.approvecust(id);
		if (i > 0) {
			setMsg("approved successfully by admin  ");
			return combo3();
		}
		return null;
	}

	public String RejCustomer() throws SQLException, ClassNotFoundException {
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext()
				.get("ServletActionContext.HTTP_REQUEST");
		Long id = getId()/* Long.parseLong(request.getParameter("id")) */;
		int i = dl.rejectcust(id);
		if (i > 0) {
			setMsg("u r rejected   by admin  ");
			return combo3();
		}
		return null;
	}

	public String apprejbroker() throws SQLException, ClassNotFoundException {
		ResultSet rs = dl.Selectbroker(getLoginid());

		// loginaction la =new loginaction();
		if (rs.next()) {
			setLoginid(rs.getLong(1));
			setFirstname(rs.getString(2));
			setSex(rs.getString(3));
			setDmateid(rs.getString(4));
			setEmail(rs.getString(5));
			setAcno(rs.getString(6));
		}
		return "displaybroker";
	}

	public String combocust() throws Exception {
		mapForSelect = new HashMap<Long, String>();
		ResultSet rs = dl.RetBroker();
		while (rs.next())
			mapForSelect.put(rs.getLong(1), rs.getString(2));
		return "confirm";
	}

	public String combo2() throws SQLException, ClassNotFoundException {
		{
			mapForSelect = new HashMap<Long, String>();
			ResultSet rs = dl.RetBroker();
			while (rs.next())
				mapForSelect.put(rs.getLong(1), rs.getString(2));
			setMsg("Delete Succesful");
			return "confirm";
		}
	}

	public String AppBroker() throws SQLException, ClassNotFoundException {
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext()
				.get("ServletActionContext.HTTP_REQUEST");
		Long id = getId();
		// Long id=Long.parseLong(request.getParameter("id"));
		int i = dl.approvebroker(id);
		if (i > 0) {
			setMsg("approved successfully by admin  ");
			return combo2();
		}
		return null;
	}

	public String RejBroker() throws SQLException, ClassNotFoundException {
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext()
				.get("ServletActionContext.HTTP_REQUEST");
		Long id = getId();
		// Long id=Long.parseLong(request.getParameter("id"));
		int i = dl.rejectbroker(id);
		if (i > 0) {
			setMsg("u r rejected   by admin  ");
			return combo2();
		}
		return null;
	}

	public String DeleteCompany() throws SQLException, ClassNotFoundException {
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext()
				.get("ServletActionContext.HTTP_REQUEST");
		Long id = getId();
		// Long id=Long.parseLong(request.getParameter("id"));
		ResultSet rs = dl.Deletecompany(getLoginid());
		System.out.println(getLoginid());
		// loginaction la =new loginaction();
		if (rs.next()) {
			setLoginid(rs.getLong(1));
			// setUsername(rs.getString(2));
			// setPassword(rs.getString(3));
			// setUsertype(rs.getString(4));
			// setCompanyid(rs.getLong(6));
			setCompanyname(rs.getString(7));
			setAddress(rs.getString(10));
			setCity(rs.getString(11));
			setState(rs.getString(12));
			setOfficeno(rs.getString(13));
			setWebsite(rs.getString(16));
			setEmail(rs.getString(14));
			setFaxno(rs.getString(15));
			System.out.println("gggggggg" + getLoginid());

		}
		return "delcomp";
	}

	public String deleteconfirmcomp() throws SQLException, ClassNotFoundException {
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext()
				.get("ServletActionContext.HTTP_REQUEST");
		Long id = getLoginid();
		// Long id=Long.parseLong(request.getParameter("id"));
		int i = dl.delcomp(id);
		if (i > 0) {
			setMsg("   company successfuly deleted by admin  ");
			return "confirmdelete";
		}
		return null;
	}

	public String DeleteBroker() throws SQLException, ClassNotFoundException {
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext()
				.get("ServletActionContext.HTTP_REQUEST");
		Long id = getId();
		// Long id=Long.parseLong(request.getParameter("id"));
		ResultSet rs = dl.Deletebroker(getLoginid());
		System.out.println(getLoginid());
		// loginaction la =new loginaction();
		if (rs.next()) {
			setLoginid(rs.getLong(1));
			setLastname(rs.getString(10));
			setSex(rs.getString(11));
			// setUsertype(rs.getString(4));
			// setCompanyid(rs.getLong(6));
			setFirstname(rs.getString(7));
			setAddress(rs.getString(17));
			setDmateid(rs.getString(12));
			setAcno(rs.getString(13));
			setBalance(rs.getLong(19));
			setPhon(rs.getLong(15));
			setEmail(rs.getString(14));
			setExperience(rs.getString(18));
			System.out.println("gggggggg" + getLoginid());

		}
		return "success";
	}

	public String deleteconfirmbrok() throws SQLException, ClassNotFoundException {
		// HttpServletRequest
		// request=(HttpServletRequest)ActionContext.getContext().get("ServletActionContext.HTTP_REQUEST");
		Long id = getLoginid();
		System.out.println(id);
		// Long id=Long.parseLong(request.getParameter("id"));
		int i = dl.delbrok(id);
		if (i > 0) {
			System.out.println(i);
			resetbroker();
			setMsg("   broker successfuly deleted by admin  ");
			return combo2();
		}
		return null;

	}
	/*
	 * public String Editbroker()throws SQLException,ClassNotFoundException {
	 * HttpServletRequest
	 * request=(HttpServletRequest)ActionContext.getContext().get(
	 * "ServletActionContext.HTTP_REQUEST"); Long id=getId(); //Long
	 * id=Long.parseLong(request.getParameter("id")); ResultSet
	 * rs=dl.Editbroker(getLoginid()); System.out.println(getLoginid());
	 * //loginaction la =new loginaction(); if(rs.next()) {
	 * setLoginid(rs.getLong(1)); //setUsername(rs.getString(2));
	 * //setPassword(rs.getString(3)); //setUsertype(rs.getString(4));
	 * //setCompanyid(rs.getLong(6)); setSex(rs.getString(11));
	 * setAddress(rs.getString(19)); setFirstname(rs.getString(7));
	 * setLastname(rs.getString(8)); setDmateid(rs.getString(12));
	 * setAcno(rs.getString(13)); //setBalance(rs.getString(12));
	 * //setWebsi(rs.getString(16)); setEmail(rs.getString(14));
	 * setPhon(rs.getLong(15)); System.out.println("gggggggg"+getLoginid());
	 * 
	 * } return "editbrok"; } public String editconfirmbroker()throws
	 * SQLException,ClassNotFoundException { HttpServletRequest
	 * request=(HttpServletRequest)ActionContext.getContext().get(
	 * "ServletActionContext.HTTP_REQUEST"); Long id=getLoginid(); //Long
	 * id=Long.parseLong(request.getParameter("id")); int
	 * i=dl.editbrok(getLoginid(),getFirstname(),getLastname(),getSex(),getAddress()
	 * ,getDmateid(),getAcno(),getEmail(),getPhon()); if(i>0) {
	 * setMsg("   broker successfuly  updated  "); return "confirmupdate"; } return
	 * null; }
	 */

	public void resetbroker() {
		this.firstname = "";
		this.username = "";
		this.lastname = "";
		this.sex = "";
		this.address = "";
		this.dmateid = "";
		this.email = "";
		this.acno = "";
		this.experience = "";
		this.phon = null;
		this.securityquestion = "";
		this.answer = "";
		this.balance = null;
	}

	public void resetcompany() {
		this.companyname = "";
		this.dateofpost = "";
		this.enterurcomment = "";
		this.username = "";
		this.address = "";
		this.acno = "";
		this.state = "";
		this.officeno = "";
		this.email = "";
		this.faxno = "";
		this.website = "";
		this.securityquestion = "";
		this.answer = "";
	}

	public void resetuser() {
		this.firstname = "";
		this.username = "";
		this.lastname = "";
		this.sex = "";
		this.address = "";
		this.city = "";
		this.email = "";
		this.phon = null;
		this.pincode = null;
		this.dateofbirth = "";
		this.securityquestion = "";
		this.answer = "";

	}

	public String logindata() throws SQLException, ClassNotFoundException {
		ResultSet rs = dl.RetLogin(username, password, usertype);
		// System.out.println(rs.next());
		if (rs.next()) {
			String status = rs.getString("userstatus");
			String eusertype = rs.getString("usertype");
			if (eusertype.equals("admin")) {
				return "admin";
			}

			if (eusertype.equals("broker") && (status.equals("approved"))) {
				Map session = ActionContext.getContext().getSession();
				session.put("BROKERID", rs.getString(8));
				session.put("LOGINID", rs.getString(1));
				session.put("USERTYPE", usertype);
				return "broker";
			}
			if (eusertype.equals("company") && (status.equals("approved"))) {
				Map session = ActionContext.getContext().getSession();
				session.put("LOGINID", rs.getString(1));
				session.put("USERTYPE", usertype);
				return "company";
			}
			if (eusertype.equals("user") && (status.equals("approved"))) {
				Map session = ActionContext.getContext().getSession();
				session.put("COSTOMERID", rs.getString(8));
				session.put("LOGINID", rs.getString(1));
				session.put("USERTYPE", usertype);
				return "user";
			} else {
				setMsg("waiting for approval");
				return "loginfail";
			}
		}
		return "loginfail";
	}

	public String Registetipsdata() throws SQLException, ClassNotFoundException {
		int i = 0;
		// System.out.println("first"+firstname);

		i = dl.RegisterTips(getTips());

		resettips();
		// setMsg("regester successfully user");
		return "tips1";

	}

	public String tips() throws SQLException, ClassNotFoundException {
		// Map session=ActionContext.getContext().getSession();
		// String tips=(String)session.get("tips");
		System.out.println(tips);
		ResultSet rs = dl.Tip();
		while (rs.next()) {
			setTips(rs.getString(1));
		}
		return "tiips";
	}

	public void resettips() {
		this.tips = "";
	}

	public String EditCompany() throws SQLException, ClassNotFoundException {
		System.out.println("sss");
		Map session = ActionContext.getContext().getSession();
		String id1 = (String) session.get("LOGINID");
		Long loginid = Long.parseLong(id1);
		ResultSet rs = dl.Editcompany(loginid);
		if (rs.next()) {
			setLoginid(rs.getLong(1));
			setCompanyname(rs.getString(2));
			setAddress(rs.getString(3));
			setCity(rs.getString(4));
			setState(rs.getString(5));
			setOfficeno(rs.getString(6));
			setWebsite(rs.getString(7));
			setEmail(rs.getString(8));
			setFaxno(rs.getString(9));
			// System.out.println("gggggggg"+getLoginid());

		}
		return "editcomp1";
	}

	public String editconfirmcomp() throws SQLException, ClassNotFoundException {
		System.out.println(1111);
		int i = dl.edit(getLoginid(), getCompanyname(), getAddress(), getCity(), getState(), getOfficeno(),
				getWebsite(), getEmail(), getFaxno());
		if (i > 0) {
			setMsg("company successfuly  updated  ");
			return "confirmupdate";
		}
		return null;
	}

	public String Registersharedata() throws SQLException, ClassNotFoundException {

		int i = 0;
		i = dl.RegisterShare(getCompanyname(), getCompanyid(), getNoofshare(), getShareamount(), getShareprice(),
				getDateoftrans());
		System.out.print("8");
		resetbroker();
		setMsg("  company share successfully entered ");
		return "registersuccessshare";
	}

	public String Registershare() throws SQLException, ClassNotFoundException {
		Map session = ActionContext.getContext().getSession();
		String id1 = (String) session.get("LOGINID");
		Long loginid = Long.parseLong(id1);
		ResultSet rs = dl.company(loginid);
		if (rs.next()) {

			setLoginid(rs.getLong(1));
			setCompanyname(rs.getString(2));

			setCompanyid(rs.getLong(3));
		}
		return "compshr";
	}

	public String Brokerdetail() throws SQLException, ClassNotFoundException {
		Map session = ActionContext.getContext().getSession();
		String id1 = (String) session.get("LOGINID");
		Long loginid = Long.parseLong(id1);
		ResultSet rs = dl.showbroker(loginid);
		if (rs.next()) {
			setLoginid(rs.getLong(1));
			setUsername(rs.getString(2));
			// setPassword(rs.getString(3));
			// setUsertype(rs.getString(4));
			// setCompanyid(rs.getLong(6));
			// setUsername(rs.getString(2));
			// setFirstname(rs.getString(7));
			setAddress(rs.getString(17));
			// setCity(rs.getString(11));
			setSex(rs.getString(11));
			setDmateid(rs.getString(12));
			// setState(rs.getString(12));
			setAcno(rs.getString(13));
			setExperience(rs.getString(18));
			setEmail(rs.getString(14));
			// setFaxno(rs.getString(15));
			setPhon(rs.getLong(15));
			System.out.println("gggggggg" + getLoginid());

		}
		return "broker";
	}

	public String Editbroker() throws SQLException, ClassNotFoundException {
		Map session = ActionContext.getContext().getSession();
		String id1 = (String) session.get("LOGINID");
		System.out.println(id1);
		Long loginid = Long.parseLong(id1);
		ResultSet rs = dl.Editbroker(loginid);

		if (rs.next()) {
			setLoginid(rs.getLong(1));
			// setUsername(rs.getString(2));
			// setPassword(rs.getString(3));
			// setUsertype(rs.getString(4));
			setExperience(rs.getString(18));
			setSex(rs.getString(11));
			setAddress(rs.getString(17));
			setFirstname(rs.getString(9));
			setLastname(rs.getString(10));
			setDmateid(rs.getString(12));
			setAcno(rs.getString(13));
			// setBalance(rs.getString(12));
			// setWebsi(rs.getString(16));
			setEmail(rs.getString(14));
			setPhon(rs.getLong(15));
			System.out.println("gggggggg" + getLoginid());

		}
		return "editbrok";
	}

	public String editconfirmbroker() throws SQLException, ClassNotFoundException {
		Map session = ActionContext.getContext().getSession();
		String id1 = (String) session.get("LOGINID");
		System.out.println(id1);
		Long loginid = Long.parseLong(id1);
		int i = dl.editbrok(getFirstname(), getLastname(), getSex(), getAddress(), getDmateid(), getAcno(), getEmail(),
				getPhon(), loginid);
		if (i > 0) {
			setMsg("   broker successfuly  updated  ");
			return "confirmupdate";
		}
		return null;
	}

	public String EditShare() throws SQLException, ClassNotFoundException {
		System.out.println("sss");
		Map session = ActionContext.getContext().getSession();
		String id1 = (String) session.get("LOGINID");
		Long loginid = Long.parseLong(id1);
		ResultSet rs = dl.Editshare(loginid);
		if (rs.next()) {
			setCompanyid(rs.getLong(1));
			setCompanyname(rs.getString(2));
			setNoofshare(rs.getLong(3));
			setShareamount(rs.getString(4));
			setShareprice(rs.getLong(5));

		}
		return "editshare";
	}

	public String editconfirmshare() throws SQLException, ClassNotFoundException {
		System.out.println(1111);
		int i = dl.editshare(getCompanyid(), getCompanyname(), getShareamount(), getNoofshare(), getShareprice());
		System.out.println(getCompanyid() + " ");
		if (i > 0) {
			setMsg("share successfuly  updated  ");
			return "confirmupdate";
		}
		return null;
	}

	public String viewshare() throws SQLException, ClassNotFoundException {
		System.out.println("sss");

		ResultSet rs = dl.viewshare();
		if (rs.next()) {
			setCompanyid(rs.getLong(1));
			setCompanyname(rs.getString(6));
			setNoofshare(rs.getLong(2));
			setShareamount(rs.getString(5));
			setShareprice(rs.getLong(3));

		}
		return "viewshare";
	}

	public String displaycust() throws SQLException, ClassNotFoundException {
		ResultSet rs = dl.Selectcustomer1(getLoginid());

		// loginaction la =new loginaction();
		if (rs.next()) {
			setLoginid(rs.getLong(1));
			setFirstname(rs.getString(9));
			setLastname(rs.getString(10));
			setSex(rs.getString(11));
			setAddress(rs.getString(12));
			setCity(rs.getString(13));
			setDateofbirth(rs.getString(16));
			setPincode(rs.getLong(17));
			setEmail(rs.getString(14));
			setPhon(rs.getLong(15));

		}
		return "displaycust";
	}

	public String displaycust1() throws SQLException, ClassNotFoundException {
		System.out.println("sss");
		Map session = ActionContext.getContext().getSession();
		String id1 = (String) session.get("LOGINID");
		Long loginid = Long.parseLong(id1);
		ResultSet rs = dl.Selectcustomer1(loginid);

		// loginaction la =new loginaction();
		if (rs.next()) {
			setLoginid(rs.getLong(1));
			setFirstname(rs.getString(9));
			setLastname(rs.getString(10));
			setSex(rs.getString(11));
			setAddress(rs.getString(12));
			setCity(rs.getString(13));
			setDateofbirth(rs.getString(16));
			setPincode(rs.getLong(17));
			setEmail(rs.getString(14));
			setPhon(rs.getLong(15));

		}
		return "displaycust1";
	}

	public String editconfirmcust() throws SQLException, ClassNotFoundException {
		Map session = ActionContext.getContext().getSession();
		String id1 = (String) session.get("LOGINID");
		System.out.println(id1);
		Long loginid = Long.parseLong(id1);
		System.out.println(1111);
		int i = dl.editcust(getFirstname(), getLastname(), getSex(), getAddress(), getCity(), getDateofbirth(),
				getPincode(), getEmail(), getPhon(), loginid);
		// System.out.println(getCompanyid()+" ");
		if (i > 0) {
			setMsg("customer successfuly  updated  ");
			return "confirmupdate";
		}
		return null;
	}

	public String Viewbrok() throws SQLException, ClassNotFoundException {
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext()
				.get("ServletActionContext.HTTP_REQUEST");
		Long id = getId();
//Long id=Long.parseLong(request.getParameter("id"));
		ResultSet rs = dl.Editbroker(getLoginid());

		if (rs.next()) {
			setLoginid(rs.getLong(1));
			// setUsername(rs.getString(2));
			// setPassword(rs.getString(3));
			// setUsertype(rs.getString(4));
			setExperience(rs.getString(17));
			setSex(rs.getString(11));
			setAddress(rs.getString(16));
			setFirstname(rs.getString(9));
			setLastname(rs.getString(10));
			// setDmateid(rs.getString(12));
			// setCity(rs.getString(13));
			// setPincode(rs.getLong(12));
			// setDateofbirth(rs.getString(16));
			setEmail(rs.getString(14));
			setPhon(rs.getLong(15));
			System.out.println("gggggggg" + getLoginid());

		}
		return "editbrok";
	}

	public String combocomp() throws Exception {
		mapForSelect = new HashMap<Long, String>();
		// System.out.print("89");
		ResultSet rs = dl.combocomp();
		// System.out.println("84");

		while (rs.next()) {
			Long s1 = rs.getLong(1);
			// System.out.println(s1);
			mapForSelect.put(rs.getLong(1), rs.getString(2));
			// System.out.println("83");
		}
		return "confirm";

	}

	public String viewshare1() throws SQLException, ClassNotFoundException {
		System.out.println("sss");

		ResultSet rs = dl.viewshare1(getCompanyid());
		if (rs.next()) {
			setCompanyid(rs.getLong(1));
			setCompanyname(rs.getString(2));
			setNoofshare(rs.getLong(3));
			setShareamount(rs.getString(4));
			setShareprice(rs.getLong(5));

		}
		return "viewshare1";
	}

	public String Registerfeedback() throws SQLException, ClassNotFoundException {
		Map session = ActionContext.getContext().getSession();
		String id1 = (String) session.get("LOGINID");
		String user = (String) session.get("USERTYPE");
		System.out.println(user);
		Long loginid = Long.parseLong(id1);
		int i = 0;
		i = dl.feedback(getSubject(), getEnterurcomment(), getDateofpost(), loginid, user);
		resetbroker();
		setMsg(" successfuly  added ");
		return "feedback";
	}

	public String viewfeedback() throws SQLException, ClassNotFoundException {
		Map session = ActionContext.getContext().getSession();

		System.out.println("sss");
		ArrayList<loginaction> al = new ArrayList();

		ResultSet rs = dl.viewfdbck(getLevel());

		// loginaction la =new loginaction();

		while (rs.next()) {
			loginaction a = new loginaction();
			a.setLoginid(rs.getLong(1));
			a.setSubject(rs.getString(3));
			a.setDateofpost(rs.getString(2));
			al.add(a);
		}

		session.put("a", al);
		return "view";
	}

	public String viewfb() throws SQLException, ClassNotFoundException {
		// HttpServletRequest
		// request=(HttpServletRequest)ActionContext.getContext().get("ServletActionContext.HTTP_REQUEST");
		Long id = Long.parseLong(request.getParameter("id"));
		System.out.println("sss");

		ResultSet rs = dl.viewfb(id);
		// System.out.println(rs.next());
		if (rs.next()) {
			setDetail(rs.getString(1));

		}
		return "show";
	}

	public void setServletRequest(HttpServletRequest req) {
		this.request = req;
	}

	public String replyfb() throws SQLException, ClassNotFoundException {

		// HttpServletRequest
		// request=(HttpServletRequest)ActionContext.getContext().get("ServletActionContext.HTTP_REQUEST");
		/*
		 * Map session=ActionContext.getContext().getSession(); String
		 * id1=(String)session.get("LOGINID");
		 * 
		 * Long loginid=Long.parseLong(id1);
		 */
		Long id = Long.parseLong(request.getParameter("id"));
		// Long id=Long.parseLong(request.getParameter("id"));
		setId(id);
		// System.out.println(rs.next());
		return "show";
	}

	public String adminreply() throws SQLException, ClassNotFoundException {
		int i = dl.replyfb(id, reply);
		return "show";
	}

	public String self()throws Exception
	{
		System.out.println(1);
		mapForSelect=new HashMap<Long,String>();
		Map session=ActionContext.getContext().getSession();
		String s1=(String)session.get("LOGINID");
		System.out.println("aaa"+s1);
		Long idd=Long.parseLong(s1);
		System.out.println("wowww"+idd);
				mapForSelect=new HashMap<Long,String>();
				System.out.print("89");
				ResultSet rs=dl.RSCompany();
				System.out.println("84");
				while(rs.next())
				{
					 Long s11=rs.getLong(1);
					 System.out.println(s11);
					mapForSelect.put(rs.getLong(1),rs.getString(2));
					System.out.println("83");
				}
		
	  ResultSet rs1=dl.Tran(idd);
		if(rs1.next()){     
			System.out.println(rs1.getLong(1));
			setCustomerid(rs1.getLong(1));
			setCustomername(rs1.getString(2)+" "+rs1.getString(3));
			setCdemateid(rs1.getLong(4));			
			setBrokerid(rs1.getLong(5));
		setBrokername(rs1.getString(6)+" "+rs1.getString(7));
		
		}
		 
		return "Self";
	}

	public String custdetail() throws Exception {
		mapForSelect = new HashMap<Long, String>();
		ResultSet rs = dl.selectcompny();
		while (rs.next())
			mapForSelect.put(rs.getLong(1), rs.getString(2));
		return "confirm";

	}

	public String Registerdetail() throws SQLException, ClassNotFoundException {
		Map session = ActionContext.getContext().getSession();
		String s1 = (String) session.get("COSTOMERID");
		System.out.println(s1);
		Long idd = Long.parseLong(s1);
		System.out.println(idd);
		Long id = getBrokerid();
		int i = 0;

		// System.out.println("first"+firstname);

		i = dl.Registerbrokdetails(getBankname(), getBranchname(), getCacno(), getCbalance(), idd, id);

		// resettips();
		// setMsg("regester successfully user");
		return "cview";

	}

	public String Proc() throws Exception {
		Long price = null;
		Double balance = null;
		Long accno = null;
		System.out.println(getCustomerid());
		ResultSet rss1 = dl.returnAccno(getCustomerid());
		if (rss1.next()) {
			accno = rss1.getLong(1);
			System.out.println("aaaaa" + accno);
		}
		String ss = getType();
		System.out.println("eeee" + getType());
		System.out.println("gggg" + ss);
		if (getType().equalsIgnoreCase("purchase")) {
			String compnamee = null;
			Long idd = (getCompanyid());
			System.out.println("bbbbbb" + getCompanyid());
			System.out.println("abccc" + idd);
			ResultSet r = dbconnect.getStatement()
					.executeQuery("select DATEOFTRANS from SHARE1 where COMPNYID=" + idd + "");
			if (r.next()) {
				String dt = r.getString(1);
				System.out.println("ppppp" + dt);
				ResultSet rs = dl.ret(idd, dt);

				if (rs.next()) {
					price = rs.getLong(1);
					System.out.println("oooooo" + price);
				}
			}
			System.out.println(getNoofshare() + "   " + price);
			setPresentamt(getNoofshare() * price * .02);
			System.out.println("Broker amt" + presentamt);
			double total = (getNoofshare() * price);
			System.out.println("Total is:" + total);
			System.out.println("Account No is" + accno);
			ResultSet rss = dl.retBalance(accno);
			if (rss.next()) {
				balance = rss.getDouble(1);
			}

			System.out.println("Balance is" + balance);
			ResultSet rss2 = dl.retrivecompname(getCompanyid());
			if (rss2.next()) {
				compnamee = rss2.getString(1);
				System.out.println(compnamee);
			}
			setCustomerid(getCustomerid());
			setCustomername(getCustomername());
			setCdemateid(getCdemateid());
			// setCompanyid(Long.parseLong(getChoosecompany()));

			setCompanyname(compnamee);
			setNoofshare(getNoofshare());
			// setAcshare(getAcshare());
			setPresentamt1(balance);
			setAmtdeducted(total);
			setType(ss);
			return "Proc";
		}

		if (getType().equalsIgnoreCase("sale")) {
			String compnamee = null;
			Long idd = (getCompanyid());
			System.out.println(idd);
			ResultSet r = dbconnect.getStatement()
					.executeQuery("select DATEOFTRANS from SHARE1 where COMPNYID=" + idd + "");
			if (r.next()) {
				String dt = r.getString(1);
				System.out.println("simun" + dt);
				ResultSet rs = dl.ret(idd, dt);

				if (rs.next()) {
					price = rs.getLong(1);
					System.out.println("Price is" + price);
				}
			}
			System.out.println("inside sale");
			System.out.println("User id is " + customerid + "  and comp id is" + idd);
			String str = "select NOOFSHARE from FINALALLOCATION where CUSTOMERID=" + getCustomerid() + " and COMPNYID="
					+ idd + "";
			System.out.println(str + "      bbbbbbbbbbbbbb");
			ResultSet rs1 = dbconnect.getStatement()
					.executeQuery("select NOOFSHARE from FINALALLOCATION where CUSTOMERID=" + getCustomerid()
							+ " and COMPNYID=" + idd + "");
			if (rs1.next()) {
				System.out.println("gggg" + rs1.getLong(1));
				setAvlshare(rs1.getLong(1));
			}
			System.out.println(getNoofshare() + " eeeee  " + price);
			double a = getNoofshare() * price * .02;
			setPresentamt(getNoofshare() * price * .02);
			// double total= getNo_share()*price-a;
			Long total = getNoofshare() * price;
			double blnce = 0.00;
			ResultSet rss = dl.retBalance(accno);
			if (rss.next()) {
				blnce = rss.getLong(1);
			}
			ResultSet rss2 = dl.retrivecompname(getCompanyid());
			if (rss2.next()) {
				compnamee = rss2.getString(1);
				System.out.println(compnamee);
			}
			setCustomerid(getCustomerid());
			setCustomername(getCustomername());
			setCdemateid(getCdemateid());
			Long aa = (getCompanyid());

			setCompanyid(aa);
			// setBroker_id(Long.parseLong(getBrokername()));
			setCompanyname(compnamee);
			setNoofshare(getNoofshare());
			setPresentamt1(blnce);
			setAmtdeposited(total);
			setType(getType());
			setAvlshare(getAvlshare());
			return "Proc1";
		}

		return null;
	}

	public String purchase() throws Exception {
		System.out.println("enter");
		Double balance = getPresentamt1();
		System.out.println("bbbbb133445" + balance);
		Double amount = getAmtdeducted();
		System.out.println("aaaa" + amount);
		if (amount > balance) {
			setMsg("Insufficient balance!!! cannot purchase share");
			return "purfail";
		} else {

			Long bbal = null;
			Long accountno = null;
			Long broaccno = null;
			Long brobalance = null;
			double newbalance = balance - amount;

			// no_share=no_share-noshare;
			// Long accountno=getDemataccount_no();
			ResultSet rss = dl.returnbroaccount(getBrokerid());
			if (rss.next()) {
				broaccno = rss.getLong(1);
			}
			ResultSet r = dl.returnAccount(getCdemateid());
			if (r.next()) {
				accountno = r.getLong(1);
				System.out.println("ccccc11" + r.getLong(1));
			}

			ResultSet r23 = dl.returnbbalance(getBrokerid());
			if (r23.next()) {
				bbal = r23.getLong(1);
				System.out.println("ccccc11" + r23.getLong(1));
			}

			int i = dl.baldown(newbalance, accountno, broaccno, getPresentamt() + bbal);
			int j = dl.sharedown(companyid, getNoofshare());
			int k = dl.TransBuy(customerid, companyid, getNoofshare(), amount);
			if (i > 0 && j > 0) {
				setMsg("ur transaction has been successfully done!!!");
				return "purpass";
			}
			return "purpass";
		}

	}

	public String Sale1() throws Exception {
		Long shareno = getNoofshare();
		Double balance = getPresentamt1();
		Long broaccno = null;
		ResultSet rss = dl.returnbroaccount(getBrokerid());
		if (rss.next()) {
			broaccno = rss.getLong(1);
		}
		Long amount = getAmtdeposited();
		if (noofshare > getAvlshare()) {
			setMsg("U donot hold these no. of shares");
			return "salefail";
		} else {
			Long accountno = null;
			Double newbalance = balance + amount;
			// no_share=no_share-noshare;
			// Long accountno=getDemataccount_no();
			ResultSet r = dl.returnAccount(getCdemateid());
			if (r.next()) {
				accountno = r.getLong(1);
			}
			ResultSet r23 = dl.returnbbalance(getBrokerid());
			long bbal1 = 0;
			if (r23.next()) {
				bbal1 = r23.getLong(1);
				System.out.println("ccccc11" + r23.getLong(1));
			}

			int i = dl.balup(newbalance, accountno, broaccno, getPresentamt() + bbal1);
			int j = dl.sharup(companyid, getNoofshare());
			int k = dl.TransSale(customerid, companyid, noofshare, amount);
			if (i > 0 && j > 0) {
				setMsg("ur transaction has been successfully done!!!");
				return "salepass";
			}
			return "salepass";
		}
	}

	public String bybroks() throws Exception {
		Map session = ActionContext.getContext().getSession();
		String s1 = (String) session.get("LOGINID");
		System.out.println(s1);
		Long idd = Long.parseLong(s1);
		mapForSelect = new HashMap<Long, String>();
		ResultSet rss = dl.Recomp();
		while (rss.next()) {
			mapForSelect.put(rss.getLong(1), rss.getString(2));
		}
		mapForSelect1 = new HashMap<Long, String>();
		ResultSet rs1 = dl.Rebrokerr();
		while (rs1.next()) {
			mapForSelect1.put(rs1.getLong(1), rs1.getString(2) + " " + rs1.getString(3));
		}
		ResultSet rs = dl.Trans(idd);
		if (rs.next()) {
			System.out.println(rs.getLong(1));
			setCustomerid(rs.getLong(1));
			setCustomername(rs.getString(2) + " " + rs.getString(3));
			setCdemateid(rs.getLong(4));
		}
		return "Trans";
	}

	public String bybrok() throws Exception {
		Long id = getCustomerid();
		Long idd = getCompanyid();

		int i = dl.bybrok(getCustomerid(), getBrokerid(), getCompanyid(), getNoofshare(), getType());
		return "trans";
	}

	public String seeHistory() throws Exception {

		SimpleDateFormat sd = new SimpleDateFormat("dd-MMM-yyyy");
		Map sess = ActionContext.getContext().getSession();
		String s1 = (String) sess.get("LOGINID");
		alist = new ArrayList<loginaction>();
		Long idd = Long.parseLong(s1);
		System.out.println("See History Loginid" + idd);
		ResultSet rs = dl.Share(idd);
		while (rs.next()) {
			loginaction la = new loginaction();
			la.setCompanyname(rs.getString(1));
			la.setNoofshare(rs.getLong(2));
			la.setShareamount(rs.getString(3));
			la.setDateoftrans(rs.getString(4));
			la.setType(rs.getString(5));
			la.setBywhom(rs.getString(6));
			alist.add(la);
		}
		sess.put("transhistory", alist);
		return "Share";
	}

	public String seeDetails() throws Exception {
		Map sess = ActionContext.getContext().getSession();
		String s1 = (String) sess.get("LOGINID");
		alist = new ArrayList<loginaction>();
		Long idd = Long.parseLong(s1);
		ResultSet rs = dl.reqdetail(idd);
		while (rs.next()) {
			loginaction la = new loginaction();
			la.setCompanyname(rs.getString(1));
			la.setNoofshare(rs.getLong(2));
			la.setBrokername(rs.getString(3) + "  " + rs.getString(4));
			la.setStatus(rs.getString(5));
			la.setRemark(rs.getString(6));
			la.setWant(rs.getString(7));
			alist.add(la);
		}
		sess.put("seedetails", alist);
		return "sucess";
	}

	public String brkSale() throws Exception {
		{
			Map sess = ActionContext.getContext().getSession();
			String s1 = (String) sess.get("LOGINID");
			alist = new ArrayList<loginaction>();
			Long idd = Long.parseLong(s1);
			ResultSet rs = dl.seerequest(idd);
			while (rs.next()) {
				System.out.println("@@@@@@@@@@@@");
				loginaction la = new loginaction();
				System.out.println("Compname is:" + rs.getString(9));
				la.setCompanyname(rs.getString(9));
				System.out.println("comp name is:" + rs.getLong(4));
				la.setCompanyid(rs.getLong(4));
				System.out.println("dhn" + rs.getString(7) + rs.getString(8));
				la.setCustomername(rs.getString(7) + rs.getString(8));
				la.setShareamount(rs.getString(5));
				System.out.println("ttttttttttttttt" + rs.getString(5));
				System.out.println("customer Id is:" + rs.getLong(3));
				la.setCustomerid(rs.getLong(3));
				/*
				 * System.out.println("User Name is:"+rs.getString(5)+" "+rs.getString(6));
				 * la.setCustomername(rs.getString(5)+" "+rs.getString(6));
				 */
				System.out.println("Id is:" + rs.getLong(1));
				la.setReqid(rs.getLong(1));
				System.out.println("Broker Id is:" + rs.getLong(2));
				la.setBrokerid(rs.getLong(2));
				alist.add(la);
			}
			sess.put("salerequest", alist);
			return "success";
		}
	}

	public String saleProcess() throws Exception {
		Long accno = null;
		Long balance = null;
		Long qty = null;
		Long price = null;
		System.out.println("eeeeeeeeeeeeeeeeeee");
		System.out.println("yyyyyy" + getReqid());
		setReqid(getReqid());
		System.out.println("xxxxx" + getCompanyid());
		setCompanyid(getCompanyid());
		System.out.println("oooooo" + getCompanyname());
		setCompanyname(getCompanyname());
		System.out.println("uuuuu" + getCustomerid());
		setCompanyid(getCompanyid());
		setCustomerid(getCustomerid());
		setCustomername(getCustomername());
		setShareamount(shareamount);
		System.out.println(
				"Trid:" + id + " compid is: " + companyid + " compname is:" + companyname + " Usr id is:" + customerid
						+ " Username is: " + customername + " ShareAmt" + shareamount + " Broker Id is" + brokerid);
		// ResultSet rst=DbConnect.getStatement().executeQuery("select compname from
		// company where comp_id="+getCid()+"");
		ResultSet rs2 = dl.returnAccno(getCustomerid());
		if (rs2.next()) {
			accno = rs2.getLong(1);
			setCacno(accno);
		}
		System.out.println("Acc No is:" + accno);
		/*
		 * ResultSet rss=dl.retBalance(accno); if(rss.next()) { balance=rss.getLong(1);
		 * } System.out.println("Balance is :"+balance);
		 */
		System.out.println("kkkkk" + getCustomerid());
		System.out.println("vvvv" + getCompanyid());

		ResultSet rs1 = dbconnect.getStatement().executeQuery("select * from FINALALLOCATION where CUSTOMERID="
				+ getCustomerid() + " and COMPNYID=" + getCompanyid() + "");
		// System.out.println(rs1.next());
		if (rs1.next()) {

			// setA(rs1.getLong(3));
			setNoofshare(rs1.getLong(3));
			System.out.println("tttt" + rs1.getLong(3));
		}
		Long shr = Long.parseLong(shareamount);
		setSaleshare(shr);
		ResultSet rs4 = dbconnect.getStatement().executeQuery("select * from REQUESTED  ");
		System.out.println("Users No of Share is: " + noofshare);
		ResultSet r = dbconnect.getStatement()
				.executeQuery("select DATEOFTRANS from SHARE1 where COMPNYID=" + getCompanyid() + "");
		if (r.next()) {
			String dt = r.getString(1);
			System.out.println("simun" + dt);
			ResultSet rs = dl.ret(getCompanyid(), dt);
			// SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yy");
			// java.util.Date d=new java.util.Date();
			// String sdate=sd.format(d);

			if (rs.next()) {
				price = rs.getLong(1);
			}
		}
		System.out.println("Price Is: " + price);
		setShareprice(price);
		System.out.println("hhhhh" + rs1.getLong(3));
		Long share = rs1.getLong(3);
		double a = share * price * .05;
		System.out.println(a);
		setBroamount(share * price * .05);
		// double total= getNo_share()*price-a;
		long total = share * price;
		setAmtdeposited(total);
		ResultSet rss2 = dl.retriveinform(getBrokerid());
		if (rss2.next()) {
			setDmateid(rss2.getString(1));
			setAcno(rss2.getString(2));
		}
		return "ssaleshr";
	}

	public String saleProcessed() throws Exception {
		System.out.println("SALE PROCESS");
		System.out.println("request id is" + getReqid());
		System.out.println("usre account is:" + cacno + "user balance is" + getAmtdeposited());
		System.out.println("broker account is:" + acno + "broker balance is" + broamount);
		if (saleshare > noofshare) {
			setMsg("Sale Unsuccessful");
			int i = dbconnect.getStatement().executeUpdate(
					"update requested set status='processed',remark='Sale Fail' where req_id=" + getReqid() + "");
		} else {
			System.out.println();
			System.out.println("update FINALALLOCATION set NOOFSHARE=NOOFSHARE-" + noofshare
					+ " where CUSTOMERID=customerid" + "2222222222222222222222");
			int n = dbconnect.getStatement().executeUpdate(
					"update FINALALLOCATION set NOOFSHARE=NOOFSHARE-" + saleshare + " where CUSTOMERID=customerid");
			int i = dbconnect.getStatement().executeUpdate(
					"update requested set status='processed',remark='Sale Success' where req_id=" + getReqid() + "");
			int j = dbconnect.getStatement().executeUpdate(
					"update CUSTACCOUNT set balance=balance+" + getAmtdeposited() + " where ACNO=" + cacno + "");
			int k = dbconnect.getStatement().executeUpdate(
					"update BROKERACCOUNT set balance=balance+" + broamount + " where ACNO=" + acno + "");
			int l = dl.sharup(getCompanyid(), getNoofshare());
			int m = dl.TransBroBuy(customerid, companyid, noofshare, getAmtdeposited());
		}
		return "success";
	}

	public String brkPurchase() throws Exception {
		Map sess = ActionContext.getContext().getSession();
		String s1 = (String) sess.get("LOGINID");
		alist = new ArrayList<loginaction>();
		Long idd = Long.parseLong(s1);

		ResultSet rs = dl.seerequest1(idd);
		while (rs.next()) {
			System.out.println("@@@@@@@@@@@@");
			loginaction la = new loginaction();
			System.out.println("Compname is:" + rs.getString(9));
			la.setCompanyname(rs.getString(9));
			System.out.println("comp name is:" + rs.getLong(4));
			la.setCompanyid(rs.getLong(4));
			System.out.println("dhn" + rs.getString(7) + rs.getString(8));
			la.setCustomername(rs.getString(7) + rs.getString(8));
			la.setShareamount(rs.getString(5));
			System.out.println("ttttttttttttttt" + rs.getString(5));
			System.out.println("customer Id is:" + rs.getLong(3));
			la.setCustomerid(rs.getLong(3));
			/*
			 * System.out.println("User Name is:"+rs.getString(5)+" "+rs.getString(6));
			 * la.setCustomername(rs.getString(5)+" "+rs.getString(6));
			 */
			System.out.println("Id is:" + rs.getLong(1));
			la.setReqid(rs.getLong(1));
			System.out.println("Broker Id is:" + rs.getLong(2));
			la.setBrokerid(rs.getLong(2));
			alist.add(la);
		}
		sess.put("purchaserequest", alist);
		return "success";
	}

	public String purchaseProcess() throws Exception

	{
		double d = 0.0;
		Long accno = null;
		double balance = 0.00;
		Long qty = null;
		Long price = null;
		System.out.println("eeeeeeeeeeeeeeeeeee");
		System.out.println("yyyyyy" + getReqid());
		setReqid(getReqid());
		System.out.println("xxxxx" + getCompanyid());
		setCompanyid(getCompanyid());
		System.out.println("oooooo" + getCompanyname());
		setCompanyname(getCompanyname());
		System.out.println("uuuuu" + getCustomerid());
		setCompanyid(getCompanyid());
		setCustomerid(getCustomerid());
		setCustomername(getCustomername());
		setNoofshare(noofshare);
		System.out.println("Trid:" + id + " compid is: " + companyid + " compname is:" + companyname + " Usr id is:"
				+ customerid + " Username is: " + customername + " ShareAmt is :" + shareamount + " Broker Id is"
				+ brokerid);
		ResultSet rs13 = dbconnect.getStatement().executeQuery("select * from CUSTACCOUNT");
		while (rs13.next()) {
			loginaction la = new loginaction();
			System.out.println("present amt of customer  is:" + rs13.getString(2));
			d = Double.parseDouble(rs13.getString(2));
			la.setPresentamt(d);
			System.out.println(d);
		}

		// ResultSet rst=DbConnect.getStatement().executeQuery("select compname from
		// company where comp_id="+getCid()+"");
		ResultSet rs2 = dl.returnAccno(getCustomerid());
		if (rs2.next()) {
			accno = rs2.getLong(1);
			setCacno(accno);
		}
		System.out.println("Acc No is:" + accno);
		/*
		 * ResultSet rss=dl.retBalance(accno); if(rss.next()) { balance=rss.getLong(1);
		 * } System.out.println("Balance is :"+balance);
		 */
		System.out.println("kkkkk" + getCustomerid());
		System.out.println("vvvv" + getCompanyid());
		// setPresentamt(balance);
		ResultSet rs1 = dbconnect.getStatement().executeQuery("select * from FINALALLOCATION where CUSTOMERID="
				+ getCustomerid() + " and COMPNYID=" + getCompanyid() + "");
		// System.out.println(rs1.next());
		if (rs1.next()) {

			// setA(rs1.getLong(3));
			setNoofshare(rs1.getLong(3));
			System.out.println("tttt" + rs1.getLong(3));
		}
		Long shr = Long.parseLong(shareamount);
		setSaleshare(shr);
		ResultSet rs4 = dbconnect.getStatement().executeQuery("select * from REQUESTED  ");
		System.out.println("Users No of Share is: " + noofshare);
		ResultSet r = dbconnect.getStatement()
				.executeQuery("select DATEOFTRANS from SHARE1 where COMPNYID=" + getCompanyid() + "");
		if (r.next()) {
			String dt = r.getString(1);
			System.out.println("simun" + dt);
			ResultSet rs = dl.ret(getCompanyid(), dt);
			// SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yy");
			// java.util.Date d=new java.util.Date();
			// String sdate=sd.format(d);

			if (rs.next()) {
				price = rs.getLong(1);
			}
		}
		System.out.println("Price Is: " + price);
		setPresentamt(d);
		setShareprice(price);
		System.out.println("hhhhh" + rs1.getLong(3));
		Long share = rs1.getLong(3);
		double a = share * price * .05;
		System.out.println(a);
		setBroamount(share * price * .05);
		// double total= getNo_share()*price+a;
		double total = share * price + a;
		setAmtdeducted(total);
		ResultSet rss2 = dl.retriveinform(getBrokerid());
		if (rss2.next()) {
			setDmateid(rss2.getString(1));
			setAcno(rss2.getString(2));
		}
		return "spurchaseshr";
	}

	public String purchaseProcessed() throws Exception {
		System.out.println("PURCHASE PROCESS");
		System.out.println("request id is" + getReqid());
		System.out.println("present amt is " + getPresentamt());
		System.out.println("usre account is:" + cacno + "user baalance is" + getAmtdeducted());
		System.out.println("broker account is:" + acno + "broker balance is" + broamount);
		if (amtdeducted > presentamt) {
			setMsg("purchase Unsuccessful");
			int i = dbconnect.getStatement().executeUpdate(
					"update requested set status='processed',remark='purchase Fail' where req_id=" + getReqid() + "");
		} else {
			System.out.println();
			System.out.println("update FINALALLOCATION set NOOFSHARE=NOOFSHARE+" + saleshare
					+ " where CUSTOMERID=customerid" + "2222222222222222222222");
			int n = dbconnect.getStatement().executeUpdate(
					"update FINALALLOCATION set NOOFSHARE=NOOFSHARE+" + saleshare + " where CUSTOMERID=customerid");
			int i = dbconnect.getStatement()
					.executeUpdate("update requested set status='processed',remark='purchase Success' where req_id="
							+ getReqid() + "");
			int j = dbconnect.getStatement().executeUpdate(
					"update CUSTACCOUNT set balance=balance-" + getAmtdeducted() + " where ACNO=" + cacno + "");
			int k = dbconnect.getStatement().executeUpdate(
					"update BROKERACCOUNT set balance=balance+" + broamount + " where ACNO=" + acno + "");
			int l = dl.sharedown(getCompanyid(), getSaleshare());
			int m = dl.TransBroBuy(customerid, companyid, saleshare, getAmtdeposited());
		}
		return "successd";
	}

	public String seeownshare() throws SQLException, ClassNotFoundException {
		String r1 = null;

		Map sess = ActionContext.getContext().getSession();
		String s1 = (String) sess.get("LOGINID");
		Long loginid = Long.parseLong(s1);
		System.out.println(s1 + "      " + loginid);
		System.out.println("sss");
		ResultSet rs1 = dbconnect.getStatement().executeQuery(
				"select c.CUSTOMERID from CUSTOMER1 c,LOGIN l where l.loginid=c.loginid and l.loginid=" + loginid + "");
		if (rs1.next()) {
			r1 = rs1.getString(1);
		}
		Long l = Long.parseLong(r1);
		System.out.println(l + "gggggggggggg");

		ResultSet rs2 = dbconnect.getStatement()
				.executeQuery("select COMPNYID,NOOFSHARE from FINALALLOCATION where CUSTOMERID=" + l + "");
		long l2 = 0;
		if (rs2.next()) {
			l2 = rs2.getLong(1);
			setNoofshare(rs2.getLong(2));
			// l2=rs2.getLong(1);
			System.out.println(l2 + "mmmmmmmmmmmmmmmm");
		}
		ResultSet rs = dl.viewownshr1(l2);
		if (rs.next()) {

			setCompanyname(rs.getString(1));
			// setNoofshare(rs.getLong(3));

		}
		return "viewshare1";
	}

	public String forgotpsw() throws SQLException, ClassNotFoundException {
		int i = 0;
		// System.out.println("first"+firstname);
		String us = getUsertype();
		System.out.println(us + getUsername() + getSecurityquestion() + getAnswer());
		ResultSet rs = dl.forgtpsw(getUsername(), getSecurityquestion(), getAnswer(), us);
		if (rs.next()) {
			setUsername(rs.getString(1));
		}
		setUsertype(us);
		// setMsg("update successfully user");
		return "updtpsw";

	}

	public String confrmpsw() throws SQLException, ClassNotFoundException {
		int i = 0;
		// System.out.println("first"+firstname);
		String us = getUsertype();
		System.out.println(getNpassword() + "ddddd" + getRpassword() + us + "ggggggggggg");
		if (getNpassword().equals(getRpassword())) {
			i = dl.confmpsw(getUsername(), getUsertype(), getNpassword());
		}
		if (i == 2) {
			setMsg("new password is set u can login now");
			return "updtpswconfrm";
		} else {
			setMsg("reenter password ");
			npassword = "";
			rpassword = "";
			return "updtpswfail";
		}

	}

	public String combo5() throws Exception {
		mapForSelect = new HashMap<Long, String>();
		System.out.print("89");
		ResultSet rs = dl.RetCustomer();
		System.out.println("84");

		while (rs.next()) {
			Long s1 = rs.getLong(1);
			System.out.println(s1);
			mapForSelect.put(rs.getLong(1), rs.getString(2));
			System.out.println("83");
		}
		return "confirm";

	}

	public String deletcustomer() throws Exception {
		ResultSet rs = dl.Deletecustomer(getLoginid());
		System.out.println("xxxx" + getLoginid());
		// loginaction la =new loginaction();
		if (rs.next()) {
			setLoginid(rs.getLong(1));
			// setUsername(rs.getString(2));
			// setPassword(rs.getString(3));
			// setUsertype(rs.getString(4));
			// setCompanyid(rs.getLong(6));
			setFirstname(rs.getString(2));
			setLastname(rs.getString(3));
			setSex(rs.getString(4));
			setAddress(rs.getString(5));
			setCity(rs.getString(6));
			setEmail(rs.getString(7));
			// setFaxno(rs.getString(8));
			setPhon(rs.getLong(8));
			setDateofbirth(rs.getString(9));
			setPincode(rs.getLong(10));
			setLoginid(rs.getLong(11));
			System.out.println("gggggggg" + getLoginid());

		}
		return "confirm";

	}

	public String deletcustomerrec() throws Exception {
		Long id = getLoginid();
		// Long id=Long.parseLong(request.getParameter("id"));
		int i = dl.delcust(id);
		if (i > 0) {
			setMsg("   customer successfuly deleted by admin  ");
			return combo5();
		}
		return null;
	}

}
