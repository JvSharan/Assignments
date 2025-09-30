package language.basics;

public class Arrays {

	public static void main(String[] args) {
		
		String semSubSta [][][] = new String[5][6][2];
		
		//Sem-1 ----> index[0]
		semSubSta[0][0][0] = "Mathematics I";
		semSubSta[0][0][1] = "Pass(78)";
		semSubSta[0][1][0] = "Physics";
		semSubSta[0][1][1] = "Pass(85)";
		semSubSta[0][2][0] = "Chemistry";
		semSubSta[0][2][1] = "Fail(21)";
		semSubSta[0][3][0] = "Computer Programming";
		semSubSta[0][3][1] = "Pass(74)";
		semSubSta[0][4][0] = "Engineering Drawing";
		semSubSta[0][4][1] = "Pass(88)";
		semSubSta[0][5][0] = "Basic Electrical Eng.";
		semSubSta[0][5][1] = "Pass(79)";
		//Sem-1 ----> index[0]
		
		
		//===============================================
		
		//Sem-2 ----> index[1]
		semSubSta[1][0][0] = "Mathematics II";
		semSubSta[1][0][1] = "Pass(82)";
		semSubSta[1][1][0] = "Mechanics";
		semSubSta[1][1][1] = "Pass(77)";
		semSubSta[1][2][0] = "Environmental Sci.";
		semSubSta[1][2][1] = "Pass(93)";
		semSubSta[1][3][0] = "Basic Electronics";
		semSubSta[1][3][1] = "Fail(19)";
		semSubSta[1][4][0] = "Engineering Physics";
		semSubSta[1][4][1] = "Fail(24)";
		semSubSta[1][5][0] = "Engineering Graphics";
		semSubSta[1][5][1] = "Pass(90)";
		//Sem-2 ----> index[1]
		
		//=================================================
		
		//Sem-3 ----> index[2]
		semSubSta[2][0][0] = "Data Structures";
		semSubSta[2][0][1] = "Pass(88)";
		semSubSta[2][1][0] = "Discrete Mathematics";
		semSubSta[2][1][1] = "Pass(81)";
		semSubSta[2][2][0] = "Digital Electronics";
		semSubSta[2][2][1] = "Pass(76)";
		semSubSta[2][3][0] = "Operating Systems";
		semSubSta[2][3][1] = "Fail(32)";
		semSubSta[2][4][0] = "Signals and Systems";
		semSubSta[2][4][1] = "Pass(85)";
		semSubSta[2][5][0] = "Object-Oriented Prog.";
		semSubSta[2][5][1] = "Pass(78)";
		//Sem-3 ----> index[2]
		
		//======================================================
		
		//Sem-4 ----> index[3]
		semSubSta[3][0][0] = "Algorithms";
		semSubSta[3][0][1] = "Pass(91)";
		semSubSta[3][1][0] = "Computer Networks";
		semSubSta[3][1][1] = "Pass(73)";
		semSubSta[3][2][0] = "Database Systems";
		semSubSta[3][2][1] = "Fail(19)";
		semSubSta[3][3][0] = "Microprocessors";
		semSubSta[3][3][1] = "Pass(80)";
		semSubSta[3][4][0] = "Communication Eng.";
		semSubSta[3][4][1] = "Pass(76)";
		semSubSta[3][5][0] = "Software Engineering";
		semSubSta[3][5][1] = "Pass(87)";
		//Sem-4 ----> index[3]
		
		//==================================================
		
		//Sem-5 ----> index[4]
		semSubSta[4][0][0] = "Probability & Stats";
		semSubSta[4][0][1] = "Pass(86)";
		semSubSta[4][1][0] = "Machine Learning";
		semSubSta[4][1][1] = "Pass(88)";
		semSubSta[4][2][0] = "Compiler Design";
		semSubSta[4][2][1] = "Pass(84)";
		semSubSta[4][3][0] = "Theory of Computation";
		semSubSta[4][3][1] = "Pass(95)";
		semSubSta[4][4][0] = "Embedded Systems";
		semSubSta[4][4][1] = "Pass(73)";
		semSubSta[4][5][0] = "Computer Graphics";
		semSubSta[4][5][1] = "Pass(90)";
		//Sem-5 ----> index[4]
		
		//=======================================================
		
		System.out.println("Print Semester 2 Subject 4 and Subject 5 Names: ");
		System.out.println("-----------------------------------------------");
		System.out.println("Semester 2 Subject 4 Name: " + semSubSta[1][3][0]);
		System.out.println("Semester 2 Subject 5 Name: " + semSubSta[1][4][0]);
		
		System.out.println();
		
		System.out.println("============================================================");
		System.out.println("============================================================");
		
		System.out.println();
		
		System.out.println("Print the Status/Marks of Semester 4 Subject 3 and Subject 6: ");
		System.out.println("-------------------------------------------------------------");
		System.out.println("Semester 4 Subject 3 Status/Marks: " + semSubSta[3][2][1]);
		System.out.println("Semester 4 Subject 6 Status/Marks: " + semSubSta[3][5][1]);
		
	}

}
