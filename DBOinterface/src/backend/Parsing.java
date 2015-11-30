package backend;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.InputStream;
//import java.util.Iterator;
import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
//для чего ss ??

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFRow;
import java.util.Vector;
//import frontend.*;

public class Parsing {	
	//for interface
	//static private int person;
	static public boolean comfort;
	
	/*
	static public int services_size;
	static public int security_size;
	static public boolean[] services_interface = new boolean[services_size];
	static public boolean[] security_interface = new boolean[security_size];
	*/
	static public boolean[] all_user_selection = new boolean[31]; //поменять, если будут добавленны новые 	
	static public boolean[] tmp_security_selection = new boolean[30];
	static public int array_size=0;
	
	//for backend
	static public String[] banks = new String[8];
	static int number_of_bank=0;
	static public double[] rating_of_banks = new double[8]; //рейтинг банков
	
	//sorted
	static public String[] sorted_banks = new String[8];
	static public double[] sorted_rating_of_banks = new double[8];
	
	
	// Этот парсинг работает ТОЛЬКО с xls

	
	//определяем какой поток создать
	//Но не ошибиться ни к коем случае с цифрой!!!
	public static HSSFWorkbook whoPerson(int person) throws Exception {
	
		if (person==0) {
			InputStream in1 = new FileInputStream("/home/alexander/Files/Workspaces/eclipse/broker_online_banking/DBexcel/физ_лица.xls");
			HSSFWorkbook wb = new HSSFWorkbook(in1);
			ExcelExtractor extractor = new ExcelExtractor(wb);
			return wb;			
		}
		else if (person==1) {
			InputStream in2 = new FileInputStream("/home/alexander/Files/Workspaces/eclipse/broker_online_banking/DBexcel/малый_средний_бизнес.xls");
			HSSFWorkbook wb = new HSSFWorkbook(in2);
			ExcelExtractor extractor = new ExcelExtractor(wb);
			return wb;
		}
		else /*if (person==2)*/ { //не безопасно!!!
			InputStream in3 = new FileInputStream("/home/alexander/Files/Workspaces/eclipse/broker_online_banking/DBexcel/корпорации.xls");
			HSSFWorkbook wb = new HSSFWorkbook(in3);
			ExcelExtractor extractor = new ExcelExtractor(wb);
			return wb;
		}
	}
	
	
	//проводится подбор банков овечающих выбору пользователя по услугам
	//на вход подаётся число соответствующее лицу
	//0=физ лица, 1=юр лица, 2=корпорации
	public static void calculateServices(int person) throws Exception {
		
		int size_of_services = 0;
		if (person==0) {
			//короче, нужных столбцов
			size_of_services=18; //проверить это число
		}
		else if (person==1) {
			size_of_services=22; //???
		}
		else if (person==2) {
			size_of_services=21; //???
		}
		
		for (int i=3; i<11; i++) { //идём по строкам
			boolean flag=true;
			//String tmp_bank= null;
			String tmp_bank ="-" ;
			String[] parsing_rating= new String[2];
			String[] parsing_rating2= new String[2];
			double tmp_rating=0.0;
			double tmp_rating_final=0.0;
			double coefficient;
			
			//int test=4;//test
			for (int j=1; j<size_of_services+1; j++) { //идём по столбцам
				if (all_user_selection[j-1]==true) {
				//if (test>0) { //test
					//test-=1;//test
					tmp_bank = whoPerson(person).getSheetAt(0).getRow(i).getCell(0).toString(); //НОРМАЛЬНО??? //кладём название банка в tmp переменную
					//конвертируем парсинг в int
					//if (0==Integer.parseInt( wb.getSheetAt(0).getRow(i).getCell(j).toString() )) //если услуга ==0, т е её нет, то флаг false
					
					//здесь считаем рейтинг
					//tmp_rating+=Double.parseDouble( whoPerson(person).getSheetAt(0).getRow(i).getCell(j).toString() );
					tmp_rating=Double.parseDouble( whoPerson(person).getSheetAt(0).getRow(i).getCell(j).toString() );
					parsing_rating=whoPerson(person).getSheetAt(0).getRow(2).getCell(j).toString().split("\\[");
					//String tmp = parsing_rating[1];
					parsing_rating2=parsing_rating[1].split("\\]");
					coefficient=Double.parseDouble(parsing_rating2[0]);
					//System.out.println("ACHTUNG, str: " + parsing_rating2[0]);
					tmp_rating*=coefficient;
					tmp_rating_final+=tmp_rating;
					//System.out.println("ACHTUNG, coeff: " + tmp_rating_final);
					
					//не получился парсинг, поэтому нужно опеределать файл
					/*
					for (int ind=0; ind < parsing_rating.length(); ind++) {
						//String parsing_rating2;
						if (parsing_rating[ind].equals("[")){
							
						}
					}
					*/
					//System.out.println("HERE!!!  " + tmp_rating);
					//здесь считаем рейтинг. Конец.
					
					if (whoPerson(person).getSheetAt(0).getRow(i).getCell(j).toString().equals("0.0")) //если услуга ==0, т е её нет, то флаг false
						flag=false;
				}
			}
			if (flag == true) {
				banks[number_of_bank]=tmp_bank;
			
				//здесь СКЛАДЫВАЕМ рейтинг
				rating_of_banks[number_of_bank]+=tmp_rating_final;
				//System.out.println("HERE!!!  " + rating_of_banks[number_of_bank]);
				tmp_rating_final=0.0;
				//здесь СКЛАДЫВАЕМ рейтинг. Конец.
			}
			else {
				//banks[number_of_bank]=null;
				banks[number_of_bank]= "-";
				
				/*
				//в случае, если банк не подходит, то сбрасываем рейтинг
				rating_of_banks[number_of_bank]=0;
				*/
			}
			number_of_bank++; //специально сделано, чтобы сохранился порядок, потому благодаря этому можно сделать очень хорошо сортировку!
		}
	}
	
	public static void calculateServicesAndSecurity(int person) throws Exception {
		
		int size_of_services = 0;
		if (person==0) {
			//короче, нужных столбцов
			size_of_services=18+8; //проверить это число //всего 8 столбцов безопасности
		}
		else if (person==1) {
			size_of_services=22+9; //??? //всего 9 столбцов безопасности
		}
		else if (person==2) {
			size_of_services=21+7; //??? //всего 7 столбцов безопасности
		}
		
		for (int i=3; i<11; i++) { //идём по строкам
			boolean flag=true;
			//String tmp_bank= null;
			String tmp_bank ="-" ;
			String[] parsing_rating= new String[2];
			String[] parsing_rating2= new String[2];
			double tmp_rating=0.0;
			double tmp_rating_final=0.0;
			double coefficient;
			
			//int test=4;//test
			for (int j=1; j<size_of_services+1; j++) { //идём по столбцам
				if ((all_user_selection[j-1]==true)) {
				//if (test>0) { //test
					//test-=1;//test
					tmp_bank = whoPerson(person).getSheetAt(0).getRow(i).getCell(0).toString(); //НОРМАЛЬНО??? //кладём название банка в tmp переменную
					//конвертируем парсинг в int
					//if (0==Integer.parseInt( wb.getSheetAt(0).getRow(i).getCell(j).toString() )) //если услуга ==0, т е её нет, то флаг false
					
					//здесь считаем рейтинг
					//tmp_rating+=Double.parseDouble( whoPerson(person).getSheetAt(0).getRow(i).getCell(j).toString() );
					tmp_rating=Double.parseDouble( whoPerson(person).getSheetAt(0).getRow(i).getCell(j).toString() );
					parsing_rating=whoPerson(person).getSheetAt(0).getRow(2).getCell(j).toString().split("\\[");
					//String tmp = parsing_rating[1];
					parsing_rating2=parsing_rating[1].split("\\]");
					coefficient=Double.parseDouble(parsing_rating2[0]);
					System.out.println("ACHTUNG, str: " + parsing_rating2[0]);
					tmp_rating*=coefficient;
					tmp_rating_final+=tmp_rating;
					System.out.println("ACHTUNG, coeff: " + tmp_rating_final);
					
					//не получился парсинг, поэтому нужно опеределать файл
					/*
					for (int ind=0; ind < parsing_rating.length(); ind++) {
						//String parsing_rating2;
						if (parsing_rating[ind].equals("[")){
							
						}
					}
					*/
					//System.out.println("HERE!!!  " + tmp_rating);
					//здесь считаем рейтинг. Конец.
					
					if (whoPerson(person).getSheetAt(0).getRow(i).getCell(j).toString().equals("0.0")) //если услуга ==0, т е её нет, то флаг false
						flag=false;
				}
			}
			if (flag == true) {
				banks[number_of_bank]=tmp_bank;
			
				//здесь СКЛАДЫВАЕМ рейтинг
				rating_of_banks[number_of_bank]+=tmp_rating_final;
				//System.out.println("HERE!!!  " + rating_of_banks[number_of_bank]);
				tmp_rating_final=0.0;
				//здесь СКЛАДЫВАЕМ рейтинг. Конец.
			}
			else {
				//banks[number_of_bank]=null;
				banks[number_of_bank]= "-";
				
				/*
				//в случае, если банк не подходит, то сбрасываем рейтинг
				rating_of_banks[number_of_bank]=0;
				*/
			}
			number_of_bank++; //специально сделано, чтобы сохранился порядок, потому благодаря этому можно сделать очень хорошо сортировку!
		}
	}
	
	
	//Возвращает рейтинг по безопасности
	//person -> лицо (от 0 до 2)  number_of_bank -> номер банка (от 0 до 7)
	public static int securityDefault(int person, int number_of_bank) throws Exception {
		//Константы-рейтинг для всех банков и лиц:
		int banks_physical[]={235,265,0,195,165,200,200,225};
		int banks_jurid[]={300,275,180,100,205,170,145,220};
		int banks_corp[]={245,215,190,140,150,135,190,190};
		if (person==0) {
			return  banks_physical[number_of_bank];
		}
		else if (person==1) {
			return  banks_jurid[number_of_bank];
		}
		else //Небезопасно!!! (как переделать?)
			return  banks_corp[number_of_bank];
	}
	
	//Методы для вызова для интерфейса. Начало.
	
	//после выборки банков плюсуем в рейтинг значения рейтинга по-дефолту для безопасности
	//дальше сортировка ДОЛЖНА быть
	public static void calculateServicesAndSecurityDefault(int person, boolean comfort_var) throws Exception {
		calculateServices(person);
		for (int i=0; i < rating_of_banks.length; i++) {
			if ( !banks[i].equals("-") ) { //Проверить!!!
				rating_of_banks[i]+=securityDefault(person, i);
			}
		}
		
		if (comfort_var==true)
			comfort(person);
		
		sorting();
	}
	
	public static void calculateServicesAndSecurityNotDefault(int person, boolean comfort_var) throws Exception {
		calculateServicesAndSecurity(person);
		if (comfort_var==true)
			comfort(person);
		sorting();
	}
	//Методы для вызова для интерфейса. Конец.
	
	
	//сортировка //ПРОВЕРИТЬ!!! ОПТИМИЗИРОВАТЬ???
	public static void sorting() throws Exception {
		//int best_result=rating_of_banks[0];
		double best_result=0;
		int number_of_bank=-1;
		
		//sorted_banks[0]=banks[0];
		//sorted_rating_of_banks[0]=rating_of_banks[0];
		
		int index=0;
		for (int j = 0; j < rating_of_banks.length; j++) {
			for (int i = 0; i < rating_of_banks.length; i++) {
				if (rating_of_banks[i]!=0 && best_result < rating_of_banks[i]) {
					
					number_of_bank=i;
					sorted_banks[index]=banks[i];
					sorted_rating_of_banks[index]=rating_of_banks[i];
					
					best_result=rating_of_banks[i];
				}		
			}
			index++;
			best_result=0;
			
			//sorted_banks[]=banks[number_of_bank];
			if (number_of_bank!=-1) {
				banks[number_of_bank]="-";
				rating_of_banks[number_of_bank]=0;
				number_of_bank=-1;
			}
		}
		
		//если рейтинг отсортированный в нулях, то ничего не подходит
		//...
	}
	
	public static int kind_of_comfort(int person, int number_of_bank) throws Exception {
		int comfort_physical[]={133,126,7,70,84,112,70,126};
		int comfort_jurid[]={224,120,40,80,40,48,104,184};
		int comfort_corp[]={160,120,40,80,40,48,104,136};
		
		if (person==0) {
			return  comfort_physical[number_of_bank];
		}
		else if (person==1) {
			return  comfort_jurid[number_of_bank];
		}
		else //Небезопасно!!! (как переделать?)
			return  comfort_corp[number_of_bank];
	}
	
	public static void comfort(int person) throws Exception {
		int comfort_physical[]={133,126,7,70,84,112,70,126};
		int comfort_jurid[]={300,275,180,100,205,170,145,220};
		int comfort_corp[]={245,215,190,140,150,135,190,190};
		
		for (int i=0; i < rating_of_banks.length; i++) {
			if ( !banks[i].equals("-") ) { //Проверить!!!
				rating_of_banks[i]+= kind_of_comfort(person, i);
			}
		}
	}
	
	
	//for calculation price
	/*
	public static void calculationPrice (int person) throws Exception {
		int size_of_price;
		int i;
		if (person==0) {
			size_of_price=30;//-26
			i=27;
			for (int j=3; j<11; j++)
				for (;i<30; i=29)
					if (Integer.parseInt( whoPerson(person).getSheetAt(0).getRow(j).getCell(i).toString() ) > DboBroker.price1) {
						banks[j-3]=null;
						rating_of_banks[j-3]=0.0;
					}
			i=28;
			for (int j=3; j<11; j++)
				for (;i<31; i=30)
					if (Integer.parseInt( whoPerson(person).getSheetAt(0).getRow(j).getCell(i).toString() ) > DboBroker.price2) {
						banks[j-3]=null;
						rating_of_banks[j-3]=0.0;
					}
			
		}
		else if (person==1) {
			size_of_price=38;//32
			i=32;
			for (int j=3; j<11; j++)
				for (;i<37; i+=2)
					if (Integer.parseInt( whoPerson(person).getSheetAt(0).getRow(j).getCell(i).toString() ) > DboBroker.price1) {
						banks[j-3]=null;
						rating_of_banks[j-3]=0.0;
					}
			i=33;
			for (int j=3; j<11; j++)
				for (;i<38; i+=2)
					if (Integer.parseInt( whoPerson(person).getSheetAt(0).getRow(j).getCell(i).toString() ) > DboBroker.price2) {
						banks[j-3]=null;
						rating_of_banks[j-3]=0.0;
					}
		}
		else { //dangerous!
			size_of_price=33; //-29
			i=29;
			for (int j=3; j<11; j++)
				for (;i<32; i=31)
					if (Integer.parseInt( whoPerson(person).getSheetAt(0).getRow(j).getCell(i).toString() ) > DboBroker.price1) {
						banks[j-3]=null;
						rating_of_banks[j-3]=0.0;
					}
			i=30;
			for (int j=3; j<11; j++)
				for (;i<33; i=32)
					if (Integer.parseInt( whoPerson(person).getSheetAt(0).getRow(j).getCell(i).toString() ) > DboBroker.price2) {
						banks[j-3]=null;
						rating_of_banks[j-3]=0.0;
					}
		}
		
					
			
		}
	*/
	
}
