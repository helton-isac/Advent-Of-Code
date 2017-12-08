import com.hitg.adventofcode.Day01;
import com.hitg.adventofcode.Day02;
import com.hitg.adventofcode.Day03;
import com.hitg.adventofcode.Day04;

public class Main {
	public static void main(String[] args) {
		day01();
		day02();
		day03();
		day04();
	}

	static void day01() {
		String day01Input = "34997744892914653296827871613388552993634935173733597474997393431324121718942484674492133736486619515246829248477836544451943938832848157199224116563715646126431493563772112714741546635764665586452858349326658345524573681224829221829772728531278893357146638772291782796744812479595172578555931968285326741191558735491923682586844185476584124677856856612582263263124715916498254659761312225295947328671873729594182695425852559718922816832816341259695766322357565252335851264933471555351536363944572763621761489944217787785564355131756948331413652646811626742168857634856234347432698931371757454156396432993421795675147273229642441888776517165375965288923515378871773449714189311167849788519479274172617334378412661574885156988171532483385528342851358599792154331889342985168528186562873736117113242271863318873917355428393173152783223727362282169982597123525671895452937118687191281382949335937173323862618172284254741935865963877359477126188879481911148827453781546789437317581568931445259912541273353345254171252588344612386649134562638758915336976347291218848744548755462493981871543949697331735577243658722111371552363179584543521149944247848176793571855164329415143753479297879926959141597695174674386467854776481689314612324534729187335368471697738925271618243312864656442299938886755679996568297498965651652337961837876468596749433454633975722561971935459554979713344313292511447288939379369279487299557326137798219646395436241742751581363752896833892713543627966633788455384129347637693559713174477262914916598991823983686226378396341554219544683439536933338185723832743964258335163993324191589246399535845434167819135413916443764931668386817282279877264296262823999224943974974489892778799656723453849139194948368998995531261224669478559359689167934624681622834931223728318247832134758581882736415334187562342375144693398771223127132562692525629392889723242374746911936313136382354858767169452656224519128287899264831463597663461857119132312578648894815417348364532372836621644176295776978942783714778954864719541832176633892147845693752248565147794357864859961462918847471158244516279178346514129117328285132341339595664283";
		System.out.println(
				"--------------------------------------------------------------------------------------------------");
		System.out.println("Day 1");
		System.out.println("First puzzle input: " + day01Input);
		System.out.println("Part 1");
		System.out.println("First captcha: " + Day01.inverseCaptcha(day01Input));
		System.out.println("Part 2");
		System.out.println("Second captcha: " + Day01.inverseCaptchaHalfWay(day01Input));
	}

	private static void day02() {
		int[][] day02Input = {
				{ 1919, 2959, 82, 507, 3219, 239, 3494, 1440, 3107, 259, 3544, 683, 207, 562, 276, 2963 },
				{ 587, 878, 229, 2465, 2575, 1367, 2017, 154, 152, 157, 2420, 2480, 138, 2512, 2605, 876 },
				{ 744, 6916, 1853, 1044, 2831, 4797, 213, 4874, 187, 6051, 6086, 7768, 5571, 6203, 247, 285 },
				{ 1210, 1207, 1130, 116, 1141, 563, 1056, 155, 227, 1085, 697, 735, 192, 1236, 1065, 156 },
				{ 682, 883, 187, 307, 269, 673, 290, 693, 199, 132, 505, 206, 231, 200, 760, 612 },
				{ 1520, 95, 1664, 1256, 685, 1446, 253, 88, 92, 313, 754, 1402, 734, 716, 342, 107 },
				{ 146, 1169, 159, 3045, 163, 3192, 1543, 312, 161, 3504, 3346, 3231, 771, 3430, 3355, 3537 },
				{ 177, 2129, 3507, 3635, 2588, 3735, 3130, 980, 324, 266, 1130, 3753, 175, 229, 517, 3893 },
				{ 4532, 164, 191, 5169, 4960, 3349, 3784, 3130, 5348, 5036, 2110, 151, 5356, 193, 1380, 3580 },
				{ 2544, 3199, 3284, 3009, 3400, 953, 3344, 3513, 102, 1532, 161, 143, 2172, 2845, 136, 2092 },
				{ 194, 5189, 3610, 4019, 210, 256, 5178, 4485, 5815, 5329, 5457, 248, 5204, 4863, 5880, 3754 },
				{ 3140, 4431, 4534, 4782, 3043, 209, 216, 5209, 174, 161, 3313, 5046, 1160, 160, 4036, 111 },
				{ 2533, 140, 4383, 1581, 139, 141, 2151, 2104, 2753, 4524, 4712, 866, 3338, 2189, 116, 4677 },
				{ 1240, 45, 254, 1008, 1186, 306, 633, 1232, 1457, 808, 248, 1166, 775, 1418, 1175, 287 },
				{ 851, 132, 939, 1563, 539, 1351, 1147, 117, 1484, 100, 123, 490, 152, 798, 1476, 543 },
				{ 1158, 2832, 697, 113, 121, 397, 1508, 118, 2181, 2122, 809, 2917, 134, 2824, 3154, 2791 } };

		System.out.println(
				"--------------------------------------------------------------------------------------------------");
		System.out.println("Day 2");

		System.out.println("First puzzle input:");
		System.out.println();
		for (int i = 0; i < day02Input.length; i++) {
			for (int j = 0; j < day02Input[i].length; j++) {
				System.out.print(String.format("%1$" + 6 + "s", day02Input[i][j]));
			}
			System.out.println();
		}

		System.out.println("Part 1");
		System.out.println("First captcha: " + Day02.corruptionChecksum(day02Input));

		System.out.println("Part 2");
		System.out.println("Second captcha: " + Day02.evenlyDivisibleValues(day02Input));

	}

	static void day03() {
		int day03Input = 265149;
		System.out.println(
				"--------------------------------------------------------------------------------------------------");
		System.out.println("Day 3");
		System.out.println("First puzzle input: " + day03Input);
		System.out.println("Part 1");
		System.out.println("First captcha: " + Day03.manhattanDistance(day03Input));
		System.out.println("Part 2");
		System.out.println("Second captcha: " + "Day01.blblbl(day03Input)");
	}	
	
	static void day04() {
		System.out.println(
				"--------------------------------------------------------------------------------------------------");
		System.out.println("Day 4");
		System.out.println("First puzzle input: To Long...");
		System.out.println("Answer Part 1: " + Day04.validPassPhrases(Day04.input));
		System.out.println("Answer Part 2: " + Day04.validPassPhrasesAnagram(Day04.input));
	
	}
}
