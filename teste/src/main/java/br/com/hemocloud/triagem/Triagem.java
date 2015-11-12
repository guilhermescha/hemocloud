package br.com.hemocloud.triagem;

import java.io.*;
import java.util.Date;
import javax.persistence.*;
import br.com.hemocloud.paciente.Paciente;

@Entity
public class Triagem implements Serializable {

	@Id
	@GeneratedValue
	private Integer codigo;
	@ManyToOne
	@JoinColumn(nullable = false)
	private Paciente paciente;
	@Column(nullable = false, updatable = false)
	private Date dataCadastro;

	private boolean	campo001;
	private String	campo002;
	private boolean	campo003;
	private String	campo004;
	private boolean	campo005;
	private String	campo006;
	private boolean	campo007;
	private String	campo008;
	private boolean	campo009;
	private String	campo010;
	private String	campo011;
	private boolean	campo012;
	private boolean	campo013;
	private boolean	campo014;
	private boolean	campo015;
	private String	campo016;
	private String	campo017;
	private String	campo018;
	private String	campo019;
	private boolean	campo020;
	private String	campo021;
	private String	campo022;
	private boolean	campo023;
	private boolean	campo024;
	private boolean	campo025;
	private boolean	campo026;
	private boolean	campo027;
	private String	campo028;
	private boolean	campo029;
	private String	campo030;
	private boolean	campo031;
	private String	campo032;
	private String	campo033;
	private String	campo034;
	private boolean	campo035;
	private String	campo036;
	private boolean	campo037;
	private String	campo038;
	private String	campo039;
	private boolean	campo040;
	private String	campo041;
	private boolean	campo042;
	private String	campo043;
	private boolean	campo044;
	private String	campo045;
	private boolean	campo046;
	private String	campo047;
	private String	campo048;
	private boolean	campo049;
	private boolean	campo050;
	private boolean	campo051;
	private String	campo052;
	private boolean	campo053;
	private String	campo054;
	private boolean	campo055;
	private boolean	campo056;
	private String	campo057;
	private boolean	campo058;
	private boolean	campo059;
	private boolean	campo060;
	private boolean	campo061;
	private boolean	campo062;
	private String	campo063;
	private String	campo064;
	private boolean	campo065;
	private String	campo066;
	private String	campo067;
	private boolean	campo068;
	private String	campo069;
	private boolean	campo070;
	private boolean	campo071;
	private boolean	campo072;
	private boolean	campo073;
	private String	campo074;
	private boolean	campo075;
	private boolean	campo076;
	private String	campo077;
	private String	campo078;
	private boolean	campo079;
	private String	campo080;
	private boolean	campo081;
	private boolean	campo082;
	private String	campo083;
	private boolean	campo084;
	private String	campo085;
	private boolean	campo086;
	private boolean	campo087;
	private String	campo088;
	private boolean	campo089;
	private boolean	campo090;
	private boolean	campo091;
	private String	campo092;
	private String	campo093;
	private String	campo094;
	private boolean	campo095;
	private String	campo096;
	private boolean	campo097;
	private boolean	campo098;
	private boolean	campo099;
	private String	campo100;
	private String	campo101;
	private boolean	campo102;
	private String	campo103;
	private boolean	campo104;
	private String	campo105;
	private String	campo106;
	private boolean	campo107;
	private String	campo108;
	private boolean	campo109;
	private String	campo110;
	private boolean	campo111;
	private String	campo112;
	private boolean	campo113;
	private String	campo114;
	private boolean	campo115;
	private String	campo116;
	private boolean	campo117;
	private String	campo118;
	private boolean	campo119;
	private String	campo120;
	@Version Long version;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public boolean isCampo001() {
		return campo001;
	}
	public void setCampo001(boolean campo001) {
		this.campo001 = campo001;
	}
	public String getCampo002() {
		return campo002;
	}
	public void setCampo002(String campo002) {
		this.campo002 = campo002;
	}
	public boolean isCampo003() {
		return campo003;
	}
	public void setCampo003(boolean campo003) {
		this.campo003 = campo003;
	}
	public String getCampo004() {
		return campo004;
	}
	public void setCampo004(String campo004) {
		this.campo004 = campo004;
	}
	public boolean isCampo005() {
		return campo005;
	}
	public void setCampo005(boolean campo005) {
		this.campo005 = campo005;
	}
	public String getCampo006() {
		return campo006;
	}
	public void setCampo006(String campo006) {
		this.campo006 = campo006;
	}
	public boolean isCampo007() {
		return campo007;
	}
	public void setCampo007(boolean campo007) {
		this.campo007 = campo007;
	}
	public String getCampo008() {
		return campo008;
	}
	public void setCampo008(String campo008) {
		this.campo008 = campo008;
	}
	public boolean isCampo009() {
		return campo009;
	}
	public void setCampo009(boolean campo009) {
		this.campo009 = campo009;
	}
	public String getCampo010() {
		return campo010;
	}
	public void setCampo010(String campo010) {
		this.campo010 = campo010;
	}
	public String getCampo011() {
		return campo011;
	}
	public void setCampo011(String campo011) {
		this.campo011 = campo011;
	}
	public boolean isCampo012() {
		return campo012;
	}
	public void setCampo012(boolean campo012) {
		this.campo012 = campo012;
	}
	public boolean isCampo013() {
		return campo013;
	}
	public void setCampo013(boolean campo013) {
		this.campo013 = campo013;
	}
	public boolean isCampo014() {
		return campo014;
	}
	public void setCampo014(boolean campo014) {
		this.campo014 = campo014;
	}
	public boolean isCampo015() {
		return campo015;
	}
	public void setCampo015(boolean campo015) {
		this.campo015 = campo015;
	}
	public String getCampo016() {
		return campo016;
	}
	public void setCampo016(String campo016) {
		this.campo016 = campo016;
	}
	public String getCampo017() {
		return campo017;
	}
	public void setCampo017(String campo017) {
		this.campo017 = campo017;
	}
	public String getCampo018() {
		return campo018;
	}
	public void setCampo018(String campo018) {
		this.campo018 = campo018;
	}
	public String getCampo019() {
		return campo019;
	}
	public void setCampo019(String campo019) {
		this.campo019 = campo019;
	}
	public boolean isCampo020() {
		return campo020;
	}
	public void setCampo020(boolean campo020) {
		this.campo020 = campo020;
	}
	public String getCampo021() {
		return campo021;
	}
	public void setCampo021(String campo021) {
		this.campo021 = campo021;
	}
	public String getCampo022() {
		return campo022;
	}
	public void setCampo022(String campo022) {
		this.campo022 = campo022;
	}
	public boolean isCampo023() {
		return campo023;
	}
	public void setCampo023(boolean campo023) {
		this.campo023 = campo023;
	}
	public boolean isCampo024() {
		return campo024;
	}
	public void setCampo024(boolean campo024) {
		this.campo024 = campo024;
	}
	public boolean isCampo025() {
		return campo025;
	}
	public void setCampo025(boolean campo025) {
		this.campo025 = campo025;
	}
	public boolean isCampo026() {
		return campo026;
	}
	public void setCampo026(boolean campo026) {
		this.campo026 = campo026;
	}
	public boolean isCampo027() {
		return campo027;
	}
	public void setCampo027(boolean campo027) {
		this.campo027 = campo027;
	}
	public String getCampo028() {
		return campo028;
	}
	public void setCampo028(String campo028) {
		this.campo028 = campo028;
	}
	public boolean isCampo029() {
		return campo029;
	}
	public void setCampo029(boolean campo029) {
		this.campo029 = campo029;
	}
	public String getCampo030() {
		return campo030;
	}
	public void setCampo030(String campo030) {
		this.campo030 = campo030;
	}
	public boolean isCampo031() {
		return campo031;
	}
	public void setCampo031(boolean campo031) {
		this.campo031 = campo031;
	}
	public String getCampo032() {
		return campo032;
	}
	public void setCampo032(String campo032) {
		this.campo032 = campo032;
	}
	public String getCampo033() {
		return campo033;
	}
	public void setCampo033(String campo033) {
		this.campo033 = campo033;
	}
	public String getCampo034() {
		return campo034;
	}
	public void setCampo034(String campo034) {
		this.campo034 = campo034;
	}
	public boolean isCampo035() {
		return campo035;
	}
	public void setCampo035(boolean campo035) {
		this.campo035 = campo035;
	}
	public String getCampo036() {
		return campo036;
	}
	public void setCampo036(String campo036) {
		this.campo036 = campo036;
	}
	public boolean isCampo037() {
		return campo037;
	}
	public void setCampo037(boolean campo037) {
		this.campo037 = campo037;
	}
	public String getCampo038() {
		return campo038;
	}
	public void setCampo038(String campo038) {
		this.campo038 = campo038;
	}
	public String getCampo039() {
		return campo039;
	}
	public void setCampo039(String campo039) {
		this.campo039 = campo039;
	}
	public boolean isCampo040() {
		return campo040;
	}
	public void setCampo040(boolean campo040) {
		this.campo040 = campo040;
	}
	public String getCampo041() {
		return campo041;
	}
	public void setCampo041(String campo041) {
		this.campo041 = campo041;
	}
	public boolean isCampo042() {
		return campo042;
	}
	public void setCampo042(boolean campo042) {
		this.campo042 = campo042;
	}
	public String getCampo043() {
		return campo043;
	}
	public void setCampo043(String campo043) {
		this.campo043 = campo043;
	}
	public boolean isCampo044() {
		return campo044;
	}
	public void setCampo044(boolean campo044) {
		this.campo044 = campo044;
	}
	public String getCampo045() {
		return campo045;
	}
	public void setCampo045(String campo045) {
		this.campo045 = campo045;
	}
	public boolean isCampo046() {
		return campo046;
	}
	public void setCampo046(boolean campo046) {
		this.campo046 = campo046;
	}
	public String getCampo047() {
		return campo047;
	}
	public void setCampo047(String campo047) {
		this.campo047 = campo047;
	}
	public String getCampo048() {
		return campo048;
	}
	public void setCampo048(String campo048) {
		this.campo048 = campo048;
	}
	public boolean isCampo049() {
		return campo049;
	}
	public void setCampo049(boolean campo049) {
		this.campo049 = campo049;
	}
	public boolean isCampo050() {
		return campo050;
	}
	public void setCampo050(boolean campo050) {
		this.campo050 = campo050;
	}
	public boolean isCampo051() {
		return campo051;
	}
	public void setCampo051(boolean campo051) {
		this.campo051 = campo051;
	}
	public String getCampo052() {
		return campo052;
	}
	public void setCampo052(String campo052) {
		this.campo052 = campo052;
	}
	public boolean isCampo053() {
		return campo053;
	}
	public void setCampo053(boolean campo053) {
		this.campo053 = campo053;
	}
	public String getCampo054() {
		return campo054;
	}
	public void setCampo054(String campo054) {
		this.campo054 = campo054;
	}
	public boolean isCampo055() {
		return campo055;
	}
	public void setCampo055(boolean campo055) {
		this.campo055 = campo055;
	}
	public boolean isCampo056() {
		return campo056;
	}
	public void setCampo056(boolean campo056) {
		this.campo056 = campo056;
	}
	public String getCampo057() {
		return campo057;
	}
	public void setCampo057(String campo057) {
		this.campo057 = campo057;
	}
	public boolean isCampo058() {
		return campo058;
	}
	public void setCampo058(boolean campo058) {
		this.campo058 = campo058;
	}
	public boolean isCampo059() {
		return campo059;
	}
	public void setCampo059(boolean campo059) {
		this.campo059 = campo059;
	}
	public boolean isCampo060() {
		return campo060;
	}
	public void setCampo060(boolean campo060) {
		this.campo060 = campo060;
	}
	public boolean isCampo061() {
		return campo061;
	}
	public void setCampo061(boolean campo061) {
		this.campo061 = campo061;
	}
	public boolean isCampo062() {
		return campo062;
	}
	public void setCampo062(boolean campo062) {
		this.campo062 = campo062;
	}
	public String getCampo063() {
		return campo063;
	}
	public void setCampo063(String campo063) {
		this.campo063 = campo063;
	}
	public String getCampo064() {
		return campo064;
	}
	public void setCampo064(String campo064) {
		this.campo064 = campo064;
	}
	public boolean isCampo065() {
		return campo065;
	}
	public void setCampo065(boolean campo065) {
		this.campo065 = campo065;
	}
	public String getCampo066() {
		return campo066;
	}
	public void setCampo066(String campo066) {
		this.campo066 = campo066;
	}
	public String getCampo067() {
		return campo067;
	}
	public void setCampo067(String campo067) {
		this.campo067 = campo067;
	}
	public boolean isCampo068() {
		return campo068;
	}
	public void setCampo068(boolean campo068) {
		this.campo068 = campo068;
	}
	public String getCampo069() {
		return campo069;
	}
	public void setCampo069(String campo069) {
		this.campo069 = campo069;
	}
	public boolean isCampo070() {
		return campo070;
	}
	public void setCampo070(boolean campo070) {
		this.campo070 = campo070;
	}
	public boolean isCampo071() {
		return campo071;
	}
	public void setCampo071(boolean campo071) {
		this.campo071 = campo071;
	}
	public boolean isCampo072() {
		return campo072;
	}
	public void setCampo072(boolean campo072) {
		this.campo072 = campo072;
	}
	public boolean isCampo073() {
		return campo073;
	}
	public void setCampo073(boolean campo073) {
		this.campo073 = campo073;
	}
	public String getCampo074() {
		return campo074;
	}
	public void setCampo074(String campo074) {
		this.campo074 = campo074;
	}
	public boolean isCampo075() {
		return campo075;
	}
	public void setCampo075(boolean campo075) {
		this.campo075 = campo075;
	}
	public boolean isCampo076() {
		return campo076;
	}
	public void setCampo076(boolean campo076) {
		this.campo076 = campo076;
	}
	public String getCampo077() {
		return campo077;
	}
	public void setCampo077(String campo077) {
		this.campo077 = campo077;
	}
	public String getCampo078() {
		return campo078;
	}
	public void setCampo078(String campo078) {
		this.campo078 = campo078;
	}
	public boolean isCampo079() {
		return campo079;
	}
	public void setCampo079(boolean campo079) {
		this.campo079 = campo079;
	}
	public String getCampo080() {
		return campo080;
	}
	public void setCampo080(String campo080) {
		this.campo080 = campo080;
	}
	public boolean isCampo081() {
		return campo081;
	}
	public void setCampo081(boolean campo081) {
		this.campo081 = campo081;
	}
	public boolean isCampo082() {
		return campo082;
	}
	public void setCampo082(boolean campo082) {
		this.campo082 = campo082;
	}
	public String getCampo083() {
		return campo083;
	}
	public void setCampo083(String campo083) {
		this.campo083 = campo083;
	}
	public boolean isCampo084() {
		return campo084;
	}
	public void setCampo084(boolean campo084) {
		this.campo084 = campo084;
	}
	public String getCampo085() {
		return campo085;
	}
	public void setCampo085(String campo085) {
		this.campo085 = campo085;
	}
	public boolean isCampo086() {
		return campo086;
	}
	public void setCampo086(boolean campo086) {
		this.campo086 = campo086;
	}
	public boolean isCampo087() {
		return campo087;
	}
	public void setCampo087(boolean campo087) {
		this.campo087 = campo087;
	}
	public String getCampo088() {
		return campo088;
	}
	public void setCampo088(String campo088) {
		this.campo088 = campo088;
	}
	public boolean isCampo089() {
		return campo089;
	}
	public void setCampo089(boolean campo089) {
		this.campo089 = campo089;
	}
	public boolean isCampo090() {
		return campo090;
	}
	public void setCampo090(boolean campo090) {
		this.campo090 = campo090;
	}
	public boolean isCampo091() {
		return campo091;
	}
	public void setCampo091(boolean campo091) {
		this.campo091 = campo091;
	}
	public String getCampo092() {
		return campo092;
	}
	public void setCampo092(String campo092) {
		this.campo092 = campo092;
	}
	public String getCampo093() {
		return campo093;
	}
	public void setCampo093(String campo093) {
		this.campo093 = campo093;
	}
	public String getCampo094() {
		return campo094;
	}
	public void setCampo094(String campo094) {
		this.campo094 = campo094;
	}
	public boolean isCampo095() {
		return campo095;
	}
	public void setCampo095(boolean campo095) {
		this.campo095 = campo095;
	}
	public String getCampo096() {
		return campo096;
	}
	public void setCampo096(String campo096) {
		this.campo096 = campo096;
	}
	public boolean isCampo097() {
		return campo097;
	}
	public void setCampo097(boolean campo097) {
		this.campo097 = campo097;
	}
	public boolean isCampo098() {
		return campo098;
	}
	public void setCampo098(boolean campo098) {
		this.campo098 = campo098;
	}
	public boolean isCampo099() {
		return campo099;
	}
	public void setCampo099(boolean campo099) {
		this.campo099 = campo099;
	}
	public String getCampo100() {
		return campo100;
	}
	public void setCampo100(String campo100) {
		this.campo100 = campo100;
	}
	public String getCampo101() {
		return campo101;
	}
	public void setCampo101(String campo101) {
		this.campo101 = campo101;
	}
	public boolean isCampo102() {
		return campo102;
	}
	public void setCampo102(boolean campo102) {
		this.campo102 = campo102;
	}
	public String getCampo103() {
		return campo103;
	}
	public void setCampo103(String campo103) {
		this.campo103 = campo103;
	}
	public boolean isCampo104() {
		return campo104;
	}
	public void setCampo104(boolean campo104) {
		this.campo104 = campo104;
	}
	public String getCampo105() {
		return campo105;
	}
	public void setCampo105(String campo105) {
		this.campo105 = campo105;
	}
	public String getCampo106() {
		return campo106;
	}
	public void setCampo106(String campo106) {
		this.campo106 = campo106;
	}
	public boolean isCampo107() {
		return campo107;
	}
	public void setCampo107(boolean campo107) {
		this.campo107 = campo107;
	}
	public String getCampo108() {
		return campo108;
	}
	public void setCampo108(String campo108) {
		this.campo108 = campo108;
	}
	public boolean isCampo109() {
		return campo109;
	}
	public void setCampo109(boolean campo109) {
		this.campo109 = campo109;
	}
	public String getCampo110() {
		return campo110;
	}
	public void setCampo110(String campo110) {
		this.campo110 = campo110;
	}
	public boolean isCampo111() {
		return campo111;
	}
	public void setCampo111(boolean campo111) {
		this.campo111 = campo111;
	}
	public String getCampo112() {
		return campo112;
	}
	public void setCampo112(String campo112) {
		this.campo112 = campo112;
	}
	public boolean isCampo113() {
		return campo113;
	}
	public void setCampo113(boolean campo113) {
		this.campo113 = campo113;
	}
	public String getCampo114() {
		return campo114;
	}
	public void setCampo114(String campo114) {
		this.campo114 = campo114;
	}
	public boolean isCampo115() {
		return campo115;
	}
	public void setCampo115(boolean campo115) {
		this.campo115 = campo115;
	}
	public String getCampo116() {
		return campo116;
	}
	public void setCampo116(String campo116) {
		this.campo116 = campo116;
	}
	public boolean isCampo117() {
		return campo117;
	}
	public void setCampo117(boolean campo117) {
		this.campo117 = campo117;
	}
	public String getCampo118() {
		return campo118;
	}
	public void setCampo118(String campo118) {
		this.campo118 = campo118;
	}
	public boolean isCampo119() {
		return campo119;
	}
	public void setCampo119(boolean campo119) {
		this.campo119 = campo119;
	}
	public String getCampo120() {
		return campo120;
	}
	public void setCampo120(String campo120) {
		this.campo120 = campo120;
	}
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (campo001 ? 1231 : 1237);
		result = prime * result + ((campo002 == null) ? 0 : campo002.hashCode());
		result = prime * result + (campo003 ? 1231 : 1237);
		result = prime * result + ((campo004 == null) ? 0 : campo004.hashCode());
		result = prime * result + (campo005 ? 1231 : 1237);
		result = prime * result + ((campo006 == null) ? 0 : campo006.hashCode());
		result = prime * result + (campo007 ? 1231 : 1237);
		result = prime * result + ((campo008 == null) ? 0 : campo008.hashCode());
		result = prime * result + (campo009 ? 1231 : 1237);
		result = prime * result + ((campo010 == null) ? 0 : campo010.hashCode());
		result = prime * result + ((campo011 == null) ? 0 : campo011.hashCode());
		result = prime * result + (campo012 ? 1231 : 1237);
		result = prime * result + (campo013 ? 1231 : 1237);
		result = prime * result + (campo014 ? 1231 : 1237);
		result = prime * result + (campo015 ? 1231 : 1237);
		result = prime * result + ((campo016 == null) ? 0 : campo016.hashCode());
		result = prime * result + ((campo017 == null) ? 0 : campo017.hashCode());
		result = prime * result + ((campo018 == null) ? 0 : campo018.hashCode());
		result = prime * result + ((campo019 == null) ? 0 : campo019.hashCode());
		result = prime * result + (campo020 ? 1231 : 1237);
		result = prime * result + ((campo021 == null) ? 0 : campo021.hashCode());
		result = prime * result + ((campo022 == null) ? 0 : campo022.hashCode());
		result = prime * result + (campo023 ? 1231 : 1237);
		result = prime * result + (campo024 ? 1231 : 1237);
		result = prime * result + (campo025 ? 1231 : 1237);
		result = prime * result + (campo026 ? 1231 : 1237);
		result = prime * result + (campo027 ? 1231 : 1237);
		result = prime * result + ((campo028 == null) ? 0 : campo028.hashCode());
		result = prime * result + (campo029 ? 1231 : 1237);
		result = prime * result + ((campo030 == null) ? 0 : campo030.hashCode());
		result = prime * result + (campo031 ? 1231 : 1237);
		result = prime * result + ((campo032 == null) ? 0 : campo032.hashCode());
		result = prime * result + ((campo033 == null) ? 0 : campo033.hashCode());
		result = prime * result + ((campo034 == null) ? 0 : campo034.hashCode());
		result = prime * result + (campo035 ? 1231 : 1237);
		result = prime * result + ((campo036 == null) ? 0 : campo036.hashCode());
		result = prime * result + (campo037 ? 1231 : 1237);
		result = prime * result + ((campo038 == null) ? 0 : campo038.hashCode());
		result = prime * result + ((campo039 == null) ? 0 : campo039.hashCode());
		result = prime * result + (campo040 ? 1231 : 1237);
		result = prime * result + ((campo041 == null) ? 0 : campo041.hashCode());
		result = prime * result + (campo042 ? 1231 : 1237);
		result = prime * result + ((campo043 == null) ? 0 : campo043.hashCode());
		result = prime * result + (campo044 ? 1231 : 1237);
		result = prime * result + ((campo045 == null) ? 0 : campo045.hashCode());
		result = prime * result + (campo046 ? 1231 : 1237);
		result = prime * result + ((campo047 == null) ? 0 : campo047.hashCode());
		result = prime * result + ((campo048 == null) ? 0 : campo048.hashCode());
		result = prime * result + (campo049 ? 1231 : 1237);
		result = prime * result + (campo050 ? 1231 : 1237);
		result = prime * result + (campo051 ? 1231 : 1237);
		result = prime * result + ((campo052 == null) ? 0 : campo052.hashCode());
		result = prime * result + (campo053 ? 1231 : 1237);
		result = prime * result + ((campo054 == null) ? 0 : campo054.hashCode());
		result = prime * result + (campo055 ? 1231 : 1237);
		result = prime * result + (campo056 ? 1231 : 1237);
		result = prime * result + ((campo057 == null) ? 0 : campo057.hashCode());
		result = prime * result + (campo058 ? 1231 : 1237);
		result = prime * result + (campo059 ? 1231 : 1237);
		result = prime * result + (campo060 ? 1231 : 1237);
		result = prime * result + (campo061 ? 1231 : 1237);
		result = prime * result + (campo062 ? 1231 : 1237);
		result = prime * result + ((campo063 == null) ? 0 : campo063.hashCode());
		result = prime * result + ((campo064 == null) ? 0 : campo064.hashCode());
		result = prime * result + (campo065 ? 1231 : 1237);
		result = prime * result + ((campo066 == null) ? 0 : campo066.hashCode());
		result = prime * result + ((campo067 == null) ? 0 : campo067.hashCode());
		result = prime * result + (campo068 ? 1231 : 1237);
		result = prime * result + ((campo069 == null) ? 0 : campo069.hashCode());
		result = prime * result + (campo070 ? 1231 : 1237);
		result = prime * result + (campo071 ? 1231 : 1237);
		result = prime * result + (campo072 ? 1231 : 1237);
		result = prime * result + (campo073 ? 1231 : 1237);
		result = prime * result + ((campo074 == null) ? 0 : campo074.hashCode());
		result = prime * result + (campo075 ? 1231 : 1237);
		result = prime * result + (campo076 ? 1231 : 1237);
		result = prime * result + ((campo077 == null) ? 0 : campo077.hashCode());
		result = prime * result + ((campo078 == null) ? 0 : campo078.hashCode());
		result = prime * result + (campo079 ? 1231 : 1237);
		result = prime * result + ((campo080 == null) ? 0 : campo080.hashCode());
		result = prime * result + (campo081 ? 1231 : 1237);
		result = prime * result + (campo082 ? 1231 : 1237);
		result = prime * result + ((campo083 == null) ? 0 : campo083.hashCode());
		result = prime * result + (campo084 ? 1231 : 1237);
		result = prime * result + ((campo085 == null) ? 0 : campo085.hashCode());
		result = prime * result + (campo086 ? 1231 : 1237);
		result = prime * result + (campo087 ? 1231 : 1237);
		result = prime * result + ((campo088 == null) ? 0 : campo088.hashCode());
		result = prime * result + (campo089 ? 1231 : 1237);
		result = prime * result + (campo090 ? 1231 : 1237);
		result = prime * result + (campo091 ? 1231 : 1237);
		result = prime * result + ((campo092 == null) ? 0 : campo092.hashCode());
		result = prime * result + ((campo093 == null) ? 0 : campo093.hashCode());
		result = prime * result + ((campo094 == null) ? 0 : campo094.hashCode());
		result = prime * result + (campo095 ? 1231 : 1237);
		result = prime * result + ((campo096 == null) ? 0 : campo096.hashCode());
		result = prime * result + (campo097 ? 1231 : 1237);
		result = prime * result + (campo098 ? 1231 : 1237);
		result = prime * result + (campo099 ? 1231 : 1237);
		result = prime * result + ((campo100 == null) ? 0 : campo100.hashCode());
		result = prime * result + ((campo101 == null) ? 0 : campo101.hashCode());
		result = prime * result + (campo102 ? 1231 : 1237);
		result = prime * result + ((campo103 == null) ? 0 : campo103.hashCode());
		result = prime * result + (campo104 ? 1231 : 1237);
		result = prime * result + ((campo105 == null) ? 0 : campo105.hashCode());
		result = prime * result + ((campo106 == null) ? 0 : campo106.hashCode());
		result = prime * result + (campo107 ? 1231 : 1237);
		result = prime * result + ((campo108 == null) ? 0 : campo108.hashCode());
		result = prime * result + (campo109 ? 1231 : 1237);
		result = prime * result + ((campo110 == null) ? 0 : campo110.hashCode());
		result = prime * result + (campo111 ? 1231 : 1237);
		result = prime * result + ((campo112 == null) ? 0 : campo112.hashCode());
		result = prime * result + (campo113 ? 1231 : 1237);
		result = prime * result + ((campo114 == null) ? 0 : campo114.hashCode());
		result = prime * result + (campo115 ? 1231 : 1237);
		result = prime * result + ((campo116 == null) ? 0 : campo116.hashCode());
		result = prime * result + (campo117 ? 1231 : 1237);
		result = prime * result + ((campo118 == null) ? 0 : campo118.hashCode());
		result = prime * result + (campo119 ? 1231 : 1237);
		result = prime * result + ((campo120 == null) ? 0 : campo120.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((dataCadastro == null) ? 0 : dataCadastro.hashCode());
		result = prime * result + ((paciente == null) ? 0 : paciente.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triagem other = (Triagem) obj;
		if (campo001 != other.campo001)
			return false;
		if (campo002 == null) {
			if (other.campo002 != null)
				return false;
		} else if (!campo002.equals(other.campo002))
			return false;
		if (campo003 != other.campo003)
			return false;
		if (campo004 == null) {
			if (other.campo004 != null)
				return false;
		} else if (!campo004.equals(other.campo004))
			return false;
		if (campo005 != other.campo005)
			return false;
		if (campo006 == null) {
			if (other.campo006 != null)
				return false;
		} else if (!campo006.equals(other.campo006))
			return false;
		if (campo007 != other.campo007)
			return false;
		if (campo008 == null) {
			if (other.campo008 != null)
				return false;
		} else if (!campo008.equals(other.campo008))
			return false;
		if (campo009 != other.campo009)
			return false;
		if (campo010 == null) {
			if (other.campo010 != null)
				return false;
		} else if (!campo010.equals(other.campo010))
			return false;
		if (campo011 == null) {
			if (other.campo011 != null)
				return false;
		} else if (!campo011.equals(other.campo011))
			return false;
		if (campo012 != other.campo012)
			return false;
		if (campo013 != other.campo013)
			return false;
		if (campo014 != other.campo014)
			return false;
		if (campo015 != other.campo015)
			return false;
		if (campo016 == null) {
			if (other.campo016 != null)
				return false;
		} else if (!campo016.equals(other.campo016))
			return false;
		if (campo017 == null) {
			if (other.campo017 != null)
				return false;
		} else if (!campo017.equals(other.campo017))
			return false;
		if (campo018 == null) {
			if (other.campo018 != null)
				return false;
		} else if (!campo018.equals(other.campo018))
			return false;
		if (campo019 == null) {
			if (other.campo019 != null)
				return false;
		} else if (!campo019.equals(other.campo019))
			return false;
		if (campo020 != other.campo020)
			return false;
		if (campo021 == null) {
			if (other.campo021 != null)
				return false;
		} else if (!campo021.equals(other.campo021))
			return false;
		if (campo022 == null) {
			if (other.campo022 != null)
				return false;
		} else if (!campo022.equals(other.campo022))
			return false;
		if (campo023 != other.campo023)
			return false;
		if (campo024 != other.campo024)
			return false;
		if (campo025 != other.campo025)
			return false;
		if (campo026 != other.campo026)
			return false;
		if (campo027 != other.campo027)
			return false;
		if (campo028 == null) {
			if (other.campo028 != null)
				return false;
		} else if (!campo028.equals(other.campo028))
			return false;
		if (campo029 != other.campo029)
			return false;
		if (campo030 == null) {
			if (other.campo030 != null)
				return false;
		} else if (!campo030.equals(other.campo030))
			return false;
		if (campo031 != other.campo031)
			return false;
		if (campo032 == null) {
			if (other.campo032 != null)
				return false;
		} else if (!campo032.equals(other.campo032))
			return false;
		if (campo033 == null) {
			if (other.campo033 != null)
				return false;
		} else if (!campo033.equals(other.campo033))
			return false;
		if (campo034 == null) {
			if (other.campo034 != null)
				return false;
		} else if (!campo034.equals(other.campo034))
			return false;
		if (campo035 != other.campo035)
			return false;
		if (campo036 == null) {
			if (other.campo036 != null)
				return false;
		} else if (!campo036.equals(other.campo036))
			return false;
		if (campo037 != other.campo037)
			return false;
		if (campo038 == null) {
			if (other.campo038 != null)
				return false;
		} else if (!campo038.equals(other.campo038))
			return false;
		if (campo039 == null) {
			if (other.campo039 != null)
				return false;
		} else if (!campo039.equals(other.campo039))
			return false;
		if (campo040 != other.campo040)
			return false;
		if (campo041 == null) {
			if (other.campo041 != null)
				return false;
		} else if (!campo041.equals(other.campo041))
			return false;
		if (campo042 != other.campo042)
			return false;
		if (campo043 == null) {
			if (other.campo043 != null)
				return false;
		} else if (!campo043.equals(other.campo043))
			return false;
		if (campo044 != other.campo044)
			return false;
		if (campo045 == null) {
			if (other.campo045 != null)
				return false;
		} else if (!campo045.equals(other.campo045))
			return false;
		if (campo046 != other.campo046)
			return false;
		if (campo047 == null) {
			if (other.campo047 != null)
				return false;
		} else if (!campo047.equals(other.campo047))
			return false;
		if (campo048 == null) {
			if (other.campo048 != null)
				return false;
		} else if (!campo048.equals(other.campo048))
			return false;
		if (campo049 != other.campo049)
			return false;
		if (campo050 != other.campo050)
			return false;
		if (campo051 != other.campo051)
			return false;
		if (campo052 == null) {
			if (other.campo052 != null)
				return false;
		} else if (!campo052.equals(other.campo052))
			return false;
		if (campo053 != other.campo053)
			return false;
		if (campo054 == null) {
			if (other.campo054 != null)
				return false;
		} else if (!campo054.equals(other.campo054))
			return false;
		if (campo055 != other.campo055)
			return false;
		if (campo056 != other.campo056)
			return false;
		if (campo057 == null) {
			if (other.campo057 != null)
				return false;
		} else if (!campo057.equals(other.campo057))
			return false;
		if (campo058 != other.campo058)
			return false;
		if (campo059 != other.campo059)
			return false;
		if (campo060 != other.campo060)
			return false;
		if (campo061 != other.campo061)
			return false;
		if (campo062 != other.campo062)
			return false;
		if (campo063 == null) {
			if (other.campo063 != null)
				return false;
		} else if (!campo063.equals(other.campo063))
			return false;
		if (campo064 == null) {
			if (other.campo064 != null)
				return false;
		} else if (!campo064.equals(other.campo064))
			return false;
		if (campo065 != other.campo065)
			return false;
		if (campo066 == null) {
			if (other.campo066 != null)
				return false;
		} else if (!campo066.equals(other.campo066))
			return false;
		if (campo067 == null) {
			if (other.campo067 != null)
				return false;
		} else if (!campo067.equals(other.campo067))
			return false;
		if (campo068 != other.campo068)
			return false;
		if (campo069 == null) {
			if (other.campo069 != null)
				return false;
		} else if (!campo069.equals(other.campo069))
			return false;
		if (campo070 != other.campo070)
			return false;
		if (campo071 != other.campo071)
			return false;
		if (campo072 != other.campo072)
			return false;
		if (campo073 != other.campo073)
			return false;
		if (campo074 == null) {
			if (other.campo074 != null)
				return false;
		} else if (!campo074.equals(other.campo074))
			return false;
		if (campo075 != other.campo075)
			return false;
		if (campo076 != other.campo076)
			return false;
		if (campo077 == null) {
			if (other.campo077 != null)
				return false;
		} else if (!campo077.equals(other.campo077))
			return false;
		if (campo078 == null) {
			if (other.campo078 != null)
				return false;
		} else if (!campo078.equals(other.campo078))
			return false;
		if (campo079 != other.campo079)
			return false;
		if (campo080 == null) {
			if (other.campo080 != null)
				return false;
		} else if (!campo080.equals(other.campo080))
			return false;
		if (campo081 != other.campo081)
			return false;
		if (campo082 != other.campo082)
			return false;
		if (campo083 == null) {
			if (other.campo083 != null)
				return false;
		} else if (!campo083.equals(other.campo083))
			return false;
		if (campo084 != other.campo084)
			return false;
		if (campo085 == null) {
			if (other.campo085 != null)
				return false;
		} else if (!campo085.equals(other.campo085))
			return false;
		if (campo086 != other.campo086)
			return false;
		if (campo087 != other.campo087)
			return false;
		if (campo088 == null) {
			if (other.campo088 != null)
				return false;
		} else if (!campo088.equals(other.campo088))
			return false;
		if (campo089 != other.campo089)
			return false;
		if (campo090 != other.campo090)
			return false;
		if (campo091 != other.campo091)
			return false;
		if (campo092 == null) {
			if (other.campo092 != null)
				return false;
		} else if (!campo092.equals(other.campo092))
			return false;
		if (campo093 == null) {
			if (other.campo093 != null)
				return false;
		} else if (!campo093.equals(other.campo093))
			return false;
		if (campo094 == null) {
			if (other.campo094 != null)
				return false;
		} else if (!campo094.equals(other.campo094))
			return false;
		if (campo095 != other.campo095)
			return false;
		if (campo096 == null) {
			if (other.campo096 != null)
				return false;
		} else if (!campo096.equals(other.campo096))
			return false;
		if (campo097 != other.campo097)
			return false;
		if (campo098 != other.campo098)
			return false;
		if (campo099 != other.campo099)
			return false;
		if (campo100 == null) {
			if (other.campo100 != null)
				return false;
		} else if (!campo100.equals(other.campo100))
			return false;
		if (campo101 == null) {
			if (other.campo101 != null)
				return false;
		} else if (!campo101.equals(other.campo101))
			return false;
		if (campo102 != other.campo102)
			return false;
		if (campo103 == null) {
			if (other.campo103 != null)
				return false;
		} else if (!campo103.equals(other.campo103))
			return false;
		if (campo104 != other.campo104)
			return false;
		if (campo105 == null) {
			if (other.campo105 != null)
				return false;
		} else if (!campo105.equals(other.campo105))
			return false;
		if (campo106 == null) {
			if (other.campo106 != null)
				return false;
		} else if (!campo106.equals(other.campo106))
			return false;
		if (campo107 != other.campo107)
			return false;
		if (campo108 == null) {
			if (other.campo108 != null)
				return false;
		} else if (!campo108.equals(other.campo108))
			return false;
		if (campo109 != other.campo109)
			return false;
		if (campo110 == null) {
			if (other.campo110 != null)
				return false;
		} else if (!campo110.equals(other.campo110))
			return false;
		if (campo111 != other.campo111)
			return false;
		if (campo112 == null) {
			if (other.campo112 != null)
				return false;
		} else if (!campo112.equals(other.campo112))
			return false;
		if (campo113 != other.campo113)
			return false;
		if (campo114 == null) {
			if (other.campo114 != null)
				return false;
		} else if (!campo114.equals(other.campo114))
			return false;
		if (campo115 != other.campo115)
			return false;
		if (campo116 == null) {
			if (other.campo116 != null)
				return false;
		} else if (!campo116.equals(other.campo116))
			return false;
		if (campo117 != other.campo117)
			return false;
		if (campo118 == null) {
			if (other.campo118 != null)
				return false;
		} else if (!campo118.equals(other.campo118))
			return false;
		if (campo119 != other.campo119)
			return false;
		if (campo120 == null) {
			if (other.campo120 != null)
				return false;
		} else if (!campo120.equals(other.campo120))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (dataCadastro == null) {
			if (other.dataCadastro != null)
				return false;
		} else if (!dataCadastro.equals(other.dataCadastro))
			return false;
		if (paciente == null) {
			if (other.paciente != null)
				return false;
		} else if (!paciente.equals(other.paciente))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}
	
}