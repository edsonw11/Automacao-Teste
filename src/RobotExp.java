import java.awt.Robot;

public class RobotExp {

	public static void main(String[] args) {

		try {
			
			Robot robot = new Robot();
			robot.setAutoDelay(5000);
			while (true) {
				robot.mouseMove(790, 720);
			}

		
//			robot.setAutoDelay(500);
//			robot.keyPress(KeyEvent.VK_J);
//			robot.keyPress(KeyEvent.VK_A);
//			robot.keyPress(KeyEvent.VK_V);
//			robot.keyPress(KeyEvent.VK_A);
//			robot.keyPress(KeyEvent.VK_SPACE);
//			robot.keyPress(KeyEvent.VK_S);
//			robot.keyPress(KeyEvent.VK_I);
//			robot.keyPress(KeyEvent.VK_M);
//			robot.keyPress(KeyEvent.VK_P);
//			robot.keyPress(KeyEvent.VK_L);
//			robot.keyPress(KeyEvent.VK_E);
//			robot.keyPress(KeyEvent.VK_S);
//
//			robot.mouseMove(1100, 10);
//			robot.mousePress(InputEvent.BUTTON1_MASK);
//
//			int keyInput[] = { KeyEvent.VK_H, KeyEvent.VK_E, KeyEvent.VK_L, KeyEvent.VK_L, KeyEvent.VK_O };
//
//			Runtime.getRuntime().exec("gedit");
//
//			robot.keyPress(KeyEvent.VK_SHIFT);
//			for (int cnt2 = 0; cnt2 < keyInput.length; cnt2++) {
//				if (cnt2 > 0) {
//					robot.keyRelease(KeyEvent.VK_SHIFT);
//				}
//				robot.keyPress(keyInput[cnt2]);
//				robot.delay(500);
//			}

			// // Move o mouse de acordo com as coordenadas informadas
			// robot.mouseMove(200, 100);
			//
			// // Pressiona a tecla ENTER
			// robot.keyPress(KeyEvent.VK_ENTER);
			//
			// // Pressiona o bot‹o direito do mouse
			// robot.mousePress(InputEvent.BUTTON3_MASK);
			//
			// // Solta o bot‹o direito do mouse que estava pressionado
			// robot.mouseRelease(InputEvent.BUTTON3_MASK);
			//
			// // Captura a tela de acordo com as coordenadas informadas
			// BufferedImage bfdImg = robot.createScreenCapture(new Rectangle(0,
			// 0, 400, 400));
			//
			// // Salva a imagem
			// ImageIO.write(bfdImg, "png", new
			// File("/Users/edsonw11/Documents/" + "teste.png"));
			//
			// // Recupera a cor do pixel de acordo com a coordenada
			// Color cor = robot.getPixelColor(100, 100);
			//
			// // Imprime o RGB da cor
			// System.out.println(cor.getRGB());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
