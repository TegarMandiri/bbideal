//Finished, will added more features++
//Ver. 2.00

import java.util.Scanner;
import java.text.DecimalFormat;

public class bbideal{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

//Credit Tegar Mandiri 2019
//Contact email: tegarmndr@gmail.com

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("//Copyright Tegar Mandiri 2019");
		System.out.println("-Ver. 2.00");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Language");

		String langA = "1";
		String langB = "2";
		System.out.println("1. English");
		System.out.println("2. Bahasa");
		System.out.println(" ");
		System.out.print("Select Language : ");
		String language = scan.next();

		if(langA.equals(language)){

			System.out.println(" ");
			System.out.println("---------- Calculate Ideal Body Weight -----------");
			System.out.println(" ");
			System.out.println(" ");
		
			String ea = "1";
			String eb = "2";
			String eback = "3";
			System.out.println("Calculate ideal body weight, there is 2 ways :");
			System.out.println(" ");
			System.out.println("1. Body Mass Index (BMI)" + "\n" + "2. Broca Formula" + "\n" + " ");

			System.out.print("Select number : ");
			String select = scan.next();

			System.out.println(" ");
			System.out.println(" ");

			if(ea.equals(select)){

				System.out.println("----------------- Body Mass Index -----------------");
				System.out.println(" ");
				System.out.println("		WHO		Asia-Pacific");
				System.out.println("		(BMI)		(BMI)");
				System.out.println("Thin		<18.5		<18.5");
				System.out.println("Normal		18.5 - 24.9	18.5 - 22.9");
				System.out.println("Overweitght	25 - 29.9	23 - 24.9");
				System.out.println("Obesity		>30		>25");
				System.out.println(" ");
				System.out.print("Input body weight (kilogram)	: ");
				int ebbbmi = scan.nextInt();

				System.out.print("Input body height (meter)	: ");
				Double etbbmi = scan.nextDouble();

				Double ehtbbmi = etbbmi * etbbmi;
				Double ehbbbmi = ebbbmi / ehtbbmi;
				System.out.println(" ");
				System.out.println("--------------------------------");
				DecimalFormat ehbbbmiformat = new DecimalFormat("#.##");
				System.out.println("Body Mass Index			: " + ehbbbmiformat.format(ehbbbmi));
				System.out.println(" ");

			}else if(eb.equals(select)){

				System.out.println("----------------- Broca Formula ------------------");
				System.out.println(" ");

				String male = "1";
				String female = "2";
				System.out.println("1. Male");
				System.out.println("2. Female");
				System.out.println(" ");
				System.out.print("Select number : ");
				String gender = scan.next();

				System.out.println(" ");

				if(male.equals(gender)){

					System.out.print("Input body weight (centimeter)	: ");
					Double eltbrb = scan.nextDouble();

					System.out.println(" ");
					System.out.println("--------------------------------");

					Double elhtbrb = eltbrb - 100;
					Double elhttbrb = elhtbrb * 10/100;
					Double elhhttbrb = elhtbrb - elhttbrb;
					DecimalFormat elhhttbrbformat =  new DecimalFormat("#.##");
					System.out.println("Body weight ideal Male		: " + elhhttbrbformat.format(elhhttbrb) + " Kg");
					System.out.println(" ");

				}else if(female.equals(gender)){

					System.out.print("Input body weight (centimeter)	: ");
					Double eptbrb = scan.nextDouble();

					System.out.println(" ");
					System.out.println("--------------------------------");

					Double ephtbrb = eptbrb - 100;
					Double ephttbrb = ephtbrb * 15/100;
					Double ephhttbrb = ephtbrb - ephttbrb;
					DecimalFormat ephhttbrbformat = new DecimalFormat("#.##");
					System.out.println("Body weight ideal Female	: " + ephhttbrbformat.format(ephhttbrb) + " Kg");
					System.out.println(" ");

				}else{

					System.out.println("Input right number!");
				}

			}else{

				System.out.println("Input right number!");
			}

		}else if(langB.equals(language)){

			System.out.println(" ");
			System.out.println("---------- Menghitung berat badan Ideal -----------");
			System.out.println(" ");
			System.out.println(" ");
		
			String a = "1";
			String b = "2";
			System.out.println("Menghitung berat badan Ideal, terdapat 2 cara :");
			System.out.println(" ");
			System.out.println("1. Indeks Masa Tubuh (IMT)" + "\n" + "2. Rumus Broca" + "\n" + " ");

			System.out.print("Pilih angka : ");
			String pilih = scan.next();

			System.out.println(" ");
			System.out.println(" ");

			if(a.equals(pilih)){

				System.out.println("---------------- Indeks Masa Tubuh ----------------");
				System.out.println(" ");
				System.out.println("		WHO		Asia-Pacific");
				System.out.println("		(IMT)		(IMT)");
				System.out.println("Kurus		<18.5		<18.5");
				System.out.println("Normal		18.5 - 24.9	18.5 - 22.9");
				System.out.println("Kegemukan	25 - 29.9	23 - 24.9");
				System.out.println("Obesitas	>30		>25");
				System.out.println(" ");
				System.out.print("Masukan berat badan (kilogram)	: ");
				int bbbmi = scan.nextInt();

				System.out.print("Masukan tinggi badan (meter)	: ");
				Double tbbmi = scan.nextDouble();

				Double htbbmi = tbbmi * tbbmi;
				Double hbbbmi = bbbmi / htbbmi;
				System.out.println(" ");
				System.out.println("--------------------------------");
				DecimalFormat hbbbmiformat = new DecimalFormat("#.##");
				System.out.println("Indeks Masa Tubuh		: " + hbbbmiformat.format(hbbbmi));
				System.out.println(" ");

			}else if(b.equals(pilih)){

				System.out.println("------------------- Rumus Broca -------------------");
				System.out.println(" ");

				String pria = "1";
				String wanita = "2";
				System.out.println("1. Pria");
				System.out.println("2. wanita");
				System.out.println(" ");
				System.out.print("Pilih angka : ");
				String kelamin = scan.next();

				System.out.println(" ");

				if(pria.equals(kelamin)){

					System.out.print("Masukan tinggi badan (sentimeter)	: ");
					Double ltbrb = scan.nextDouble();

					System.out.println(" ");
					System.out.println("--------------------------------");

					Double lhtbrb = ltbrb - 100;
					Double lhttbrb = lhtbrb * 10/100;
					Double lhhttbrb = lhtbrb - lhttbrb;
					DecimalFormat lhhttbrbformat = new DecimalFormat("#.##");
					System.out.println("Berat Badan Ideal Laki-Laki		: " + lhhttbrbformat.format(lhhttbrb) + " Kg");
					System.out.println(" ");

				}else if(wanita.equals(kelamin)){

					System.out.print("Masukan tinggi badan (sentimeter)	: ");
					Double ptbrb = scan.nextDouble();

					System.out.println(" ");
					System.out.println("--------------------------------");

					Double phtbrb = ptbrb - 100;
					Double phttbrb = phtbrb * 15/100;
					Double phhttbrb = phtbrb - phttbrb;
					DecimalFormat phhttbrbformat = new DecimalFormat("#.##");
					System.out.println("Berat Badan Ideal Perempuan		: " + phhttbrbformat.format(phhttbrb) + " Kg");
					System.out.println(" ");

				}else{

					System.out.println("Masukan angka yang benar!");
				}

			}else{

				System.out.println("Masukan angka yang benar!");
			}

		}else{

			System.out.println("Input right number!");
		}
	}
}
