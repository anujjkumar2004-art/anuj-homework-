import java.util.Scanner;
class Welcometospotify
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("spotify welcome you");
		System.out.println("1. A.R RAHMAN SONG");
		System.out.println("2. ANIRUDH SONG");
		System.out.println("3. HARISH JAYARAJ SONG");
		System.out.println("4. ILLAIYARAJA SONG");
		System.out.println("5. U1 SONG");
		System.out.print("choose your song:");
		
		int choice = sc.nextInt();
		if(choice==1)
		{
			System.out.println("Welcome to A.R RAHMAN SONG");
			System.out.println("1. Melody");
			System.out.println("2. Kuthu");
			System.out.println("3. Motivational song");
			System.out.println("4. sad");
			System.out.print("Select your song type:");
			
			int option = sc.nextInt();
			if(option==1)
			{
				System.out.println("Melody");
				System.out.println("Netru illadha Matram");
				System.out.println("Enna Solla Pogirai");
				System.out.println("Ennavale Adi Ennavale");
				System.out.println("Malargale Malargale");
			}
			else if(option==2)
			{
				System.out.println("Kuthu");
				System.out.println("Thaiya Thaiya");
				System.out.println("Mukkala Mukkabala");
				System.out.println("Urvashi Urvash");
				System.out.println("Aathichudi");
			}
			else if(option==3)
			{
				System.out.println("Motivational song");
				System.out.println("Vande Mataram");
				System.out.println("Oruvan Oruvan mudhalli");
				System.out.println("Shakthi kodu");
				System.out.println("Kappal Yeari Poyachu");
			}
			else if(option==4)
			{
				System.out.println("Sad");
				System.out.println("Poongatrile");
				System.out.println("Marudaani");
				System.out.println("Marudaani");
				System.out.println("Rasathi");
				System.out.println("Oru poiyavathu Sol");
			}
			else
			{
				System.out.println("This song is not avaliable");
			}
		}
			
			if(choice==2)
			{
				System.out.println("Welcome to ANIRUDH SONG");
				System.out.println("1. Melody");
				System.out.println("2. Kuthu");
				System.out.println("3. Motivational song");
				System.out.println("4. sad");
				System.out.print("Select your song type:");
				
				int option = sc.nextInt();
				if(option==1)
				{
					System.out.println("Melody");
					System.out.println("Neeyum Nanum Anbe");
					System.out.println("Velicha Poove");
					System.out.println("Po Indru Neeyaga");
					System.out.println("Nee partha vizhigal");
				}
				else if(option==2) 
				{
					System.out.println("Kuthu");
					System.out.println("Vaathi Raid");
					System.out.println("Naa Ready");
					System.out.println("Badass");
					System.out.println("Vandha Edam");
				}
				else if(option==3)
				{
					System.out.println("Motivational song");
					System.out.println("Velai Illa pattathari");
					System.out.println("Boomi Enna Suthudhe");
					System.out.println("Boomi Enna Suthudhe");
					System.out.println("Surviva");
				}
				else if(option==4)
				{
					System.out.println("Sad");
					System.out.println("Porkanda Singam");
					System.out.println("Kanave Kanave");
					System.out.println("Kannaana Kanne");
					System.out.println("Jodi Nilave");
				}
				else
				{
					System.out.println("This song is not avaliable");
				}
			}
				
				
				if(choice==3)
				{
					System.out.println("Welcome to HARISHJAYARAJ SONG");
					System.out.println("1. Melody");
					System.out.println("2. Kuthu");
					System.out.println("3. sad");
					System.out.print("Select your song type:");
					
					int option = sc.nextInt();
					if(option==1)
					{
						System.out.println("Melody");
						System.out.println("Unnale");
						System.out.println("Annul Maele");
						System.out.println("Yedho Ondru");
						System.out.println("Vaseegara");
						System.out.println("Paartha Mudhal");
					}
					else if(option==2)
					{
						System.out.println("Kuthu");
						System.out.println("Tirunelveli Halwa Da");
						System.out.println("Aradi katre");
						System.out.println("Soda Bottle");
						System.out.println("Aruva Meesai");	
					}
					else if(option==3)
					{
						System.out.println("Sad");
						System.out.println("Venmathiye");
						System.out.println("Oh maname");
						System.out.println("Yamma Yamma");
						System.out.println("Othayile");
					}
					else
					{
						System.out.println("This song is not avaliable");
					}
				}
					
					
					if(choice==4)
					{
						System.out.println("Welcome to ILLAIYARAJA SONG");
						System.out.println("1. Melody");
						System.out.println("2. Kuthu");
						System.out.println("3. sad");
						System.out.print("Select your song type:");
						
						int option = sc.nextInt();
						if(option==1)
						{
							System.out.println("Melody");
							System.out.println("Oru kili uruguthu");
							System.out.println("Kuzhaloodhum kannanukku");
							System.out.println("Ennai thottu");
							System.out.println("Raja Raja cholan");
						}
						else if(option==2)
						{
							System.out.println("Kuthu");
							System.out.println("Ooruvittu ooruvanthu");
							System.out.println("Nooru varusham");
							System.out.println("asai Nooruvagai");
							System.out.println("Aasai Athigam vachu");
						}
						else if(option==3)
						{
							System.out.println("Sad");
							System.out.println("Kanne Kalaimane");
							System.out.println("Thene thenpaandi Neeye");
							System.out.println("Paadi Parantha Killi");
							System.out.println("Nilave Vaa");
						}
						else
						{
							System.out.println("This song is not avaliable");
						}
					}
				
					if(choice==5)
					{
							System.out.println("Welcome to U1 SONG");
							System.out.println("1. Melody");
							System.out.println("2. Kuthu");
							System.out.println("3. Motivational SONG");
							System.out.println("4. Sad");
							System.out.print("Select your song type:");
						
						int option = sc.nextInt();
						if(option==1)
						{
							System.out.println("Melody");
							System.out.println("click the song number:");
							System.out.println("1.Aathadi Manasudhan");
							System.out.println("2.Chinna sirisu");
							System.out.println("3.Venmeggam");
							System.out.println("4.Iayyayyo");
						}
						else if(option==2)
						{
							System.out.println("Kuthu");
	
							System.out.println("1.machi Machi open the bottle");
							System.out.println("2.Saroja saman nikalo");
							System.out.println("3.No money no honey");
							System.out.println("4.Villaiyadu mankatha");
							
						}
						else if(option==3)
						{
							System.out.println("Motivational song");
							System.out.println("1.Edhirthu Nill");
							System.out.println("2.Oru nalil");
							System.out.println("3.Nimirnthu NIL");
							System.out.println("4.Ungakkule Mirugam");
						}
						else if(option==4)
						{
							System.out.println("Sad");
							System.out.println("1.Kadhal valarthen");
							System.out.println("2.Yedho ondru ennai");
							System.out.println("3.Pogadhe");
							System.out.println("4.Ninaithu ninaithu");
						}
						else
						{
							System.out.println("This song is not avaliable");
						}	
					}
	}
}	