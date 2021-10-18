package OOP.Monopoly.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	public static BufferedImage board, player_1, player_2;
	public static BufferedImage[] property, chance, chest, dice;
	public static BufferedImage[] roll_btn;
	
	public static void init() {
		board = ImageLoader.loadImage("/res/MonoBoard.PNG");
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/texture/sheet 1.png"));
		
		property = new BufferedImage[28];
		chance = new BufferedImage[16];
		chest = new BufferedImage[16];
		dice = new BufferedImage[6];
		roll_btn = new BufferedImage[2];
		
		roll_btn[0] = ImageLoader.loadImage("/Roll/blue_roll.png");
		roll_btn[1] = ImageLoader.loadImage("/Roll/Capture.PNG");
		
		player_1 = sheet.crop(32 * 4, 0, 32, 32);
		player_2 = sheet.crop(32 * 4, 32 * 2, 32, 32);
		
		property[0] = ImageLoader.loadImage("/Property/Guwahata.pdf.jpg");
		property[1] = ImageLoader.loadImage("/Property/Bhubaneshwar.pdf.jpg");
		property[2] = ImageLoader.loadImage("/Property/Chennai.pdf.jpg");
		property[3] = ImageLoader.loadImage("/Property/Panaji.pdf.jpg");
		property[4] = ImageLoader.loadImage("/Property/Agra.pdf.jpg");
		property[5] = ImageLoader.loadImage("/Property/Vadodara.pdf.jpg");
		property[6] = ImageLoader.loadImage("/Property/Ludhiana.pdf.jpg");
		property[7] = ImageLoader.loadImage("/Property/electric.pdf.jpg");
		property[8] = ImageLoader.loadImage("/Property/Patna.pdf.jpg");
		property[9] = ImageLoader.loadImage("/Property/Bhopal.pdf.jpg");
		property[10] = ImageLoader.loadImage("/Property/Howrah.pdf.jpg");
		property[11] = ImageLoader.loadImage("/Property/Indore.pdf.jpg");
		property[12] = ImageLoader.loadImage("/Property/Nagpur.pdf.jpg");
		property[13] = ImageLoader.loadImage("/Property/Kochi.pdf.jpg");
		property[14] = ImageLoader.loadImage("/Property/Lucknow.pdf.jpg");
		property[15] = ImageLoader.loadImage("/Property/Chandigarh.pdf.jpg");
		property[16] = ImageLoader.loadImage("/Property/Jaipure.pdf.jpg");
		property[17] = ImageLoader.loadImage("/Property/Delhi.pdf.jpg");
		property[18] = ImageLoader.loadImage("/Property/Pune.pdf.jpg");
		property[19] = ImageLoader.loadImage("/Property/Hyderabad.pdf.jpg");
		property[20] = ImageLoader.loadImage("/Property/Water.pdf.jpg");
		property[21] = ImageLoader.loadImage("/Property/Ahmedabad.pdf.jpg");
		property[22] = ImageLoader.loadImage("/Property/Kohkata.pdf.jpg");
		property[23] = ImageLoader.loadImage("/Property/Chenn.pdf.jpg");
		property[24] = ImageLoader.loadImage("/Property/Bengaluru.pdf.jpg");
		property[25] = ImageLoader.loadImage("/Property/Chhatrapati.pdf.jpg");
		property[26] = ImageLoader.loadImage("/Property/Del.pdf.jpg");
		property[27] = ImageLoader.loadImage("/Property/Mumbai.pdf.jpg");
		
		chance[0] = ImageLoader.loadImage("/Chance/Chairman.pdf.jpg");
		chance[1] = ImageLoader.loadImage("/Chance/GoBack3Spaces.pdf.jpg");
		chance[2] = ImageLoader.loadImage("/Chance/Jail.pdf.jpg");
		chance[3] = ImageLoader.loadImage("/Chance/JailFree.pdf.jpg");
		chance[4] = ImageLoader.loadImage("/Chance/LoanMature.pdf.jpg");
		chance[5] = ImageLoader.loadImage("/Chance/PayPoorTax.pdf.jpg");
		chance[6] = ImageLoader.loadImage("/Chance/PaysDividend.pdf.jpg");
		chance[7] = ImageLoader.loadImage("/Chance/RepairsProp.pdf.jpg");
		chance[8] = ImageLoader.loadImage("/Chance/ToChennaiCentral.pdf.jpg");
		chance[9] = ImageLoader.loadImage("/Chance/ToGo.pdf.jpg");
		chance[10] = ImageLoader.loadImage("/Chance/ToJaipur.pdf.jpg");
		chance[11] = ImageLoader.loadImage("/Chance/ToLudhiana.pdf.jpg");
		chance[12] = ImageLoader.loadImage("/Chance/ToMumbai.pdf.jpg");
		chance[13] = ImageLoader.loadImage("/Chance/ToRailroad.pdf.jpg");
		chance[14] = ImageLoader.loadImage("/Chance/ToRailroad2.pdf.jpg");
		chance[15] = ImageLoader.loadImage("/Chance/ToUtility.pdf.jpg");
		
		chest[0] = ImageLoader.loadImage("/Chest/BankError.pdf.jpg");
		chest[1] = ImageLoader.loadImage("/Chest/BeautyContest.pdf.jpg");
		chest[2] = ImageLoader.loadImage("/Chest/Collect200.pdf.jpg");
		chest[3] = ImageLoader.loadImage("/Chest/DoctorFee.pdf.jpg");
		chest[4] = ImageLoader.loadImage("/Chest/Free.pdf.jpg");
		chest[5] = ImageLoader.loadImage("/Chest/GoToJail.pdf.jpg");
		chest[6] = ImageLoader.loadImage("/Chest/IncomeTax.pdf.jpg");
		chest[7] = ImageLoader.loadImage("/Chest/Inherit.pdf.jpg");
		chest[8] = ImageLoader.loadImage("/Chest/LifeInsurance.pdf.jpg");
		chest[9] = ImageLoader.loadImage("/Chest/Opera.pdf.jpg");
		chest[10] = ImageLoader.loadImage("/Chest/PayHospital.pdf.jpg");
		chest[11] = ImageLoader.loadImage("/Chest/RecieveServices.pdf.jpg");
		chest[12] = ImageLoader.loadImage("/Chest/SchoolTax.pdf.jpg");
		chest[13] = ImageLoader.loadImage("/Chest/StockSale.pdf.jpg");
		chest[14] = ImageLoader.loadImage("/Chest/StreetRepair.pdf.jpg");
		chest[15] = ImageLoader.loadImage("/Chest/XmasFund.pdf.jpg");
		
		dice[0] = ImageLoader.loadImage("/Dice/Dice 1.png");
		dice[1] = ImageLoader.loadImage("/Dice/Dice 2.png");
		dice[2] = ImageLoader.loadImage("/Dice/Dice 3.png");
		dice[3] = ImageLoader.loadImage("/Dice/Dice 4.png");
		dice[4] = ImageLoader.loadImage("/Dice/Dice 5.png");
		dice[5] = ImageLoader.loadImage("/Dice/Dice 6.png");
	}
}
