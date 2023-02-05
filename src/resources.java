public class resources {
	
	//Syllabary Table
	public final String[][] syllabary = {
			{"a","��","��"},	{"i","��","��"},	{"u","��","��"},	{"e","��","��"},	{"o","��","��"},
			{"ka","��","��"},{"ki","��","��"},{"ku","��","��"},{"ke","��","��"},{"ko","��","��"},
			{"sa","��","��"},{"shi","��","��"},{"su","��","��"},{"se","��","��"},{"so","��","��"},
			{"ta","��","��"},{"chi","��","��"},{"tsu","��","��"},{"te","��","��"},{"to","��","��"},
			{"na","��","��"},{"ni","��","��"},{"nu","��","��"},{"ne","��","��"},{"no","��","��"},
			{"ha","��","��"},{"hi","��","��"},{"fu","��","��"},{"he","��","��"},{"ho","��","��"},
			{"ma","��","��"},{"mi","��","��"},{"mu","��","��"},{"me","��","��"},	{"mo","��","��"},
			{"ya","��","��"},{"i","��","��"},{"yu","��","��"},{"e","��","��"},{"yo","��","��"},
			{"ra","��","��"},{"ri","��","��"},{"ru","��","��"},{"re","��","��"},{"ro","��","��"},
			{"wa","��","��"},{"i","��","��"},	{"u","��","��"},	{"e","��","��"},{"o","��","��"},
			{"n","��","��"},
			{"kya","����","����"},{"kyu","����","����"},{"kyo","����","����"},
			{"sha","����","����"},{"shu","����","����"},{"sho","����","����"},
			{"cha","����","����"},{"chu","����","����"},{"cho","����","����"},
			{"nya","�ˤ�","�˥�"},{"nyu","�ˤ�","�˥�"},{"nyo","�ˤ�","�˥�"},
			{"hya","�Ҥ�","�ҥ�"},{"hyu","�Ҥ�","�ҥ�"},{"hyo","�Ҥ�","�ҥ�"},
			{"mya","�ߤ�","�ߥ�"},{"myu","�ߤ�","�ߥ�"},{"myo","�ߤ�","�ߥ�"},
			{"rya","���","���"},{"ryu","���","���"},{"ryo","���","���"},
			{"ga","��","��"},{"gi","��","��"},{"gu","��","��"},{"ge","��","��"},{"go","��","��"},
			{"za","��","��"},{"ji","��","��"},{"zu","��","��"},{"ze","��","��"},{"zo","��","��"},
			{"da","��","��"},{"ji","��","��"},{"zu","��","��"},{"de","��","��"},{"do","��","��"},	
			{"ba","��","��"},{"bi","��","��"},{"bu","��","��"},{"be","��","��"},{"bo","��","��"},
			{"pa","��","��"},{"pi","��","��"},{"pu","��","��"},{"pe","��","��"},{"po","��","��"},
			{"gya","����","����"},{"gyu","����","����"},{"gyo","����","����"},
			{"ja","����","����"},{"ju","����","����"},{"jo","����","����"},
			{"bya","�Ӥ�","�ӥ�"},{"byu","�Ӥ�","�ӥ�"},{"byo","�Ӥ�","�ӥ�"},
			{"pya","�Ԥ�","�ԥ�"},{"pyu","�Ԥ�","�ԥ�"},{"pyo","�Ԥ�","�ԥ�"} };
	//End of Syllabary Table
	
	//Sound File Information
	public final String soundFolder = "voice/";
	public final String soundExtension = ".mp3";
	//End of Sound File Information
	
	//Help Menu Information
	public final String instruction, about;
	//End of Help Menu Information
	
	//Constructor
	resources()
	{
		instruction = "<html><font size=\"4\">1. Unzip the program package and make sure the Main program resides in the SAME folder with the SETTINGS.INI (if exists) and the VIOCE folder.</font></html>\n"
				    + "<html><font size=\"4\">2. The \"FROM\" field should be less than the \"TO\" field, and they both need to be in the range between Min-Max.</font></html>\n"
					+ "<html><font size=\"4\">3. \"Reset Program\" won't overwrite your saved settings, only \"Save Progress\" will.</font></html>\n"
				    + "<html><font size=\"4\">4. In the \"View Syllable Chart\" window, you can CLICK EACH SYLLABLE TO HEAR ITS PRONUNCIATION.</font></html>\n";
		about = "<html><font size=\"4\">\"Japanese Syllable Trainer\" is designed by Alexander Chen.</font></html>\n"
				+ "<html><font size=\"4\">Thanks for using.</font></html>";
	}
	//End of Constructor
}
