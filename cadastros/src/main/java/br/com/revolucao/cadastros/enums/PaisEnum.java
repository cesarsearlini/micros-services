/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.revolucao.cadastros.enums;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Cesar Searlini
 */
public enum PaisEnum {

    C00132("00132", "AFEGANISTAO"),
    C00175("00175", "ALBANIA, REPUBLICA  DA"),
    C00230("00230", "ALEMANHA"),
    C00310("00310", "BURKINA FASO"),
    C00370("00370", "ANDORRA"),
    C00400("00400", "ANGOLA"),
    C00418("00418", "ANGUILLA"),
    C00434("00434", "ANTIGUA E BARBUDA"),
    C00477("00477", "ANTILHAS HOLANDESAS"),
    C00531("00531", "ARABIA SAUDITA"),
    C00590("00590", "ARGELIA"),
    C00639("00639", "ARGENTINA"),
    C00647("00647", "ARMENIA, REPUBLICA DA"),
    C00655("00655", "ARUBA"),
    C00698("00698", "AUSTRALIA"),
    C00728("00728", "AUSTRIA"),
    C00736("00736", "AZERBAIJAO, REPUBLICA DO"),
    C00779("00779", "BAHAMAS, ILHAS"),
    C00809("00809", "BAHREIN, ILHAS"),
    C00817("00817", "BANGLADESH"),
    C00833("00833", "BARBADOS"),
    C00850("00850", "BELARUS, REPUBLICA DA"),
    C00876("00876", "BELGICA"),
    C00884("00884", "BELIZE"),
    C00906("00906", "BERMUDAS"),
    C00930("00930", "MIANMAR (BIRMANIA)"),
    C00973("00973", "BOLIVIA, ESTADO PLURINACIONAL DA"),
    C00981("00981", "BOSNIA-HERZEGOVINA (REPUBLICA DA)"),
    C01015("01015", "BOTSUANA"),
    C01058("01058", "BRASIL"),
    C01082("01082", "BRUNEI"),
    C01112("01112", "BULGARIA, REPUBLICA DA"),
    C01155("01155", "BURUNDI"),
    C01198("01198", "BUTAO"),
    C01279("01279", "CABO VERDE, REPUBLICA DE"),
    C01376("01376", "CAYMAN, ILHAS"),
    C01414("01414", "CAMBOJA"),
    C01457("01457", "CAMAROES"),
    C01490("01490", "CANADA"),
    C01504("01504", "GUERNSEY, ILHA DO CANAL (INCLUI ALDERNEY E SARK)"),
    C01508("01508", "JERSEY, ILHA DO CANAL"),
    C01511("01511", "CANARIAS, ILHAS"),
    C01538("01538", "CAZAQUISTAO, REPUBLICA DO"),
    C01546("01546", "CATAR"),
    C01589("01589", "CHILE"),
    C01600("01600", "CHINA, REPUBLICA POPULAR"),
    C01619("01619", "FORMOSA (TAIWAN)"),
    C01635("01635", "CHIPRE"),
    C01651("01651", "COCOS(KEELING),ILHAS"),
    C01694("01694", "COLOMBIA"),
    C01732("01732", "COMORES, ILHAS"),
    C01775("01775", "CONGO"),
    C01830("01830", "COOK, ILHAS"),
    C01872("01872", "COREIA (DO NORTE), REP.POP.DEMOCRATICA"),
    C01902("01902", "COREIA (DO SUL), REPUBLICA DA"),
    C01937("01937", "COSTA DO MARFIM"),
    C01953("01953", "CROACIA (REPUBLICA DA)"),
    C01961("01961", "COSTA RICA"),
    C01988("01988", "COVEITE"),
    C01996("01996", "CUBA"),
    C02291("02291", "BENIN"),
    C02321("02321", "DINAMARCA"),
    C02356("02356", "DOMINICA,ILHA"),
    C02399("02399", "EQUADOR"),
    C02402("02402", "EGITO"),
    C02437("02437", "ERITREIA"),
    C02445("02445", "EMIRADOS ARABES UNIDOS"),
    C02453("02453", "ESPANHA"),
    C02461("02461", "ESLOVENIA, REPUBLICA DA"),
    C02470("02470", "ESLOVACA, REPUBLICA"),
    C02496("02496", "ESTADOS UNIDOS"),
    C02518("02518", "ESTONIA, REPUBLICA DA"),
    C02534("02534", "ETIOPIA"),
    C02550("02550", "FALKLAND (ILHAS MALVINAS)"),
    C02593("02593", "FEROE, ILHAS"),
    C02674("02674", "FILIPINAS"),
    C02712("02712", "FINLANDIA"),
    C02755("02755", "FRANCA"),
    C02810("02810", "GABAO"),
    C02852("02852", "GAMBIA"),
    C02895("02895", "GANA"),
    C02917("02917", "GEORGIA, REPUBLICA DA"),
    C02933("02933", "GIBRALTAR"),
    C02976("02976", "GRANADA"),
    C03018("03018", "GRECIA"),
    C03050("03050", "GROENLANDIA"),
    C03093("03093", "GUADALUPE"),
    C03131("03131", "GUAM"),
    C03174("03174", "GUATEMALA"),
    C03255("03255", "GUIANA FRANCESA"),
    C03298("03298", "GUINE"),
    C03310("03310", "GUINE-EQUATORIAL"),
    C03344("03344", "GUINE-BISSAU"),
    C03379("03379", "GUIANA"),
    C03417("03417", "HAITI"),
    C03450("03450", "HONDURAS"),
    C03514("03514", "HONG KONG"),
    C03557("03557", "HUNGRIA, REPUBLICA DA"),
    C03573("03573", "IEMEN"),
    C03595("03595", "MAN, ILHA DE"),
    C03611("03611", "INDIA"),
    C03654("03654", "INDONESIA"),
    C03697("03697", "IRAQUE"),
    C03727("03727", "IRA, REPUBLICA ISLAMICA DO"),
    C03751("03751", "IRLANDA"),
    C03794("03794", "ISLANDIA"),
    C03832("03832", "ISRAEL"),
    C03867("03867", "ITALIA"),
    C03913("03913", "JAMAICA"),
    C03964("03964", "JOHNSTON, ILHAS"),
    C03999("03999", "JAPAO"),
    C04030("04030", "JORDANIA"),
    C04111("04111", "KIRIBATI"),
    C04200("04200", "LAOS, REP.POP.DEMOCR.DO"),
    C04235("04235", "LEBUAN,ILHAS"),
    C04260("04260", "LESOTO"),
    C04278("04278", "LETONIA, REPUBLICA DA"),
    C04316("04316", "LIBANO"),
    C04340("04340", "LIBERIA"),
    C04383("04383", "LIBIA"),
    C04405("04405", "LIECHTENSTEIN"),
    C04421("04421", "LITUANIA, REPUBLICA DA"),
    C04456("04456", "LUXEMBURGO"),
    C04472("04472", "MACAU"),
    C04499("04499", "MACEDONIA, ANT.REP.IUGOSLAVA"),
    C04502("04502", "MADAGASCAR"),
    C04525("04525", "MADEIRA, ILHA DA"),
    C04553("04553", "MALASIA"),
    C04588("04588", "MALAVI"),
    C04618("04618", "MALDIVAS"),
    C04642("04642", "MALI"),
    C04677("04677", "MALTA"),
    C04723("04723", "MARIANAS DO NORTE"),
    C04740("04740", "MARROCOS"),
    C04766("04766", "MARSHALL,ILHAS"),
    C04774("04774", "MARTINICA"),
    C04855("04855", "MAURICIO"),
    C04880("04880", "MAURITANIA"),
    C04885("04885", "MAYOTTE (ILHAS FRANCESAS)"),
    C04901("04901", "MIDWAY, ILHAS"),
    C04936("04936", "MEXICO"),
    C04944("04944", "MOLDAVIA, REPUBLICA DA"),
    C04952("04952", "MONACO"),
    C04979("04979", "MONGOLIA"),
    C04985("04985", "MONTENEGRO"),
    C04995("04995", "MICRONESIA"),
    C05010("05010", "MONTSERRAT,ILHAS"),
    C05053("05053", "MOCAMBIQUE"),
    C05070("05070", "NAMIBIA"),
    C05088("05088", "NAURU"),
    C05118("05118", "CHRISTMAS,ILHA (NAVIDAD)"),
    C05177("05177", "NEPAL"),
    C05215("05215", "NICARAGUA"),
    C05258("05258", "NIGER"),
    C05282("05282", "NIGERIA"),
    C05312("05312", "NIUE,ILHA"),
    C05355("05355", "NORFOLK,ILHA"),
    C05380("05380", "NORUEGA"),
    C05428("05428", "NOVA CALEDONIA"),
    C05452("05452", "PAPUA NOVA GUINE"),
    C05487("05487", "NOVA ZELANDIA"),
    C05517("05517", "VANUATU"),
    C05568("05568", "OMA"),
    C05665("05665", "PACIFICO,ILHAS DO (POSSESSAO DOS EUA)"),
    C05738("05738", "PAISES BAIXOS (HOLANDA)"),
    C05754("05754", "PALAU"),
    C05762("05762", "PAQUISTAO"),
    C05780("05780", "PALESTINA"),
    C05800("05800", "PANAMA"),
    C05860("05860", "PARAGUAI"),
    C05894("05894", "PERU"),
    C05932("05932", "PITCAIRN,ILHA"),
    C05991("05991", "POLINESIA FRANCESA"),
    C06033("06033", "POLONIA, REPUBLICA DA"),
    C06076("06076", "PORTUGAL"),
    C06114("06114", "PORTO RICO"),
    C06238("06238", "QUENIA"),
    C06254("06254", "QUIRGUIZ, REPUBLICA"),
    C06289("06289", "REINO UNIDO"),
    C06408("06408", "REPUBLICA CENTRO-AFRICANA"),
    C06475("06475", "REPUBLICA DOMINICANA"),
    C06602("06602", "REUNIAO, ILHA"),
    C06653("06653", "ZIMBABUE"),
    C06700("06700", "ROMENIA"),
    C06750("06750", "RUANDA"),
    C06769("06769", "RUSSIA, FEDERACAO DA"),
    C06777("06777", "SALOMAO, ILHAS"),
    C06858("06858", "SAARA OCIDENTAL"),
    C06874("06874", "EL SALVADOR"),
    C06904("06904", "SAMOA"),
    C06912("06912", "SAMOA AMERICANA"),
    C06955("06955", "SAO CRISTOVAO E NEVES,ILHAS"),
    C06971("06971", "SAN MARINO"),
    C07005("07005", "SAO PEDRO E MIQUELON"),
    C07056("07056", "SAO VICENTE E GRANADINAS"),
    C07102("07102", "SANTA HELENA"),
    C07153("07153", "SANTA LUCIA"),
    C07200("07200", "SAO TOME E PRINCIPE, ILHAS"),
    C07285("07285", "SENEGAL"),
    C07315("07315", "SEYCHELLES"),
    C07358("07358", "SERRA LEOA"),
    C07370("07370", "SERVIA"),
    C07412("07412", "CINGAPURA"),
    C07447("07447", "SIRIA, REPUBLICA ARABE DA"),
    C07480("07480", "SOMALIA"),
    C07501("07501", "SRI LANKA"),
    C07544("07544", "SUAZILANDIA"),
    C07560("07560", "AFRICA DO SUL"),
    C07595("07595", "SUDAO"),
    C07600("07600", "SUDÃO DO SUL"),
    C07641("07641", "SUECIA"),
    C07676("07676", "SUICA"),
    C07706("07706", "SURINAME"),
    C07722("07722", "TADJIQUISTAO, REPUBLICA DO"),
    C07765("07765", "TAILANDIA"),
    C07803("07803", "TANZANIA, REP.UNIDA DA"),
    C07820("07820", "TERRITORIO BRIT.OC.INDICO"),
    C07838("07838", "DJIBUTI"),
    C07889("07889", "CHADE"),
    C07919("07919", "TCHECA, REPUBLICA"),
    C07951("07951", "TIMOR LESTE"),
    C08001("08001", "TOGO"),
    C08052("08052", "TOQUELAU,ILHAS"),
    C08109("08109", "TONGA"),
    C08150("08150", "TRINIDAD E TOBAGO"),
    C08206("08206", "TUNISIA"),
    C08230("08230", "TURCAS E CAICOS,ILHAS"),
    C08249("08249", "TURCOMENISTAO, REPUBLICA DO"),
    C08273("08273", "TURQUIA"),
    C08281("08281", "TUVALU"),
    C08311("08311", "UCRANIA"),
    C08338("08338", "UGANDA"),
    C08451("08451", "URUGUAI"),
    C08478("08478", "UZBEQUISTAO, REPUBLICA DO"),
    C08486("08486", "VATICANO, EST.DA CIDADE DO"),
    C08508("08508", "VENEZUELA"),
    C08583("08583", "VIETNA"),
    C08630("08630", "VIRGENS,ILHAS (BRITANICAS)"),
    C08664("08664", "VIRGENS,ILHAS (E.U.A.)"),
    C08702("08702", "FIJI"),
    C08737("08737", "WAKE, ILHA"),
    C08885("08885", "CONGO, REPUBLICA DEMOCRATICA DO"),
    C08907("08907", "ZAMBIA");

    private final String codigo;
    private final String pais;
    
    private static final Map<String, PaisEnum> fromNome = new HashMap<String, PaisEnum>();
    private static final Map<String, PaisEnum> fromCodigo = new HashMap<String, PaisEnum>();  

    public String getCodigo() {
        return codigo;
    }

    public String getPais() {
        return pais;
    }

    private PaisEnum(String codigo, String pais) {
        this.codigo = codigo;
        this.pais = pais;
    }
    
    static {
        for (PaisEnum t : values()) {
            fromNome.put(t.getPais(), t);
            fromCodigo.put(t.getCodigo(), t);
        }
    }

    public static PaisEnum fromName(String nome) {
        return fromNome.get(nome);
    }
    
    public static PaisEnum fromCode(String codigo) {
        return fromCodigo.get(codigo);
    }
    
    

}
