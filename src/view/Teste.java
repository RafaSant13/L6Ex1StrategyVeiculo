package view;

import model.Carga;
import model.Motor;
import model.Passeio;

public class Teste {

	public static void main(String[] args) {
		Motor m = new Motor();
		Passeio p1 = new Passeio();
		p1.setMarca("Fiat");
		p1.setModelo("Uno");
		p1.setCor("Azul");
		p1.setPlaca("111111111");
		p1.setQtdRodas(4);
		p1.setVelocMax(130);
		p1.setQtdPassageiros(4);
		m.setQtdPist(3);
		m.setPotencia(200);
		p1.setMotor(m);
		
		System.out.printf("%.1f m/h\n", p1.calcVel(p1.getVelocMax()));
		
		Passeio p2 = new Passeio();
		p2.setMarca("Renault");
		p2.setModelo("Kwid");
		p2.setCor("Branco");
		p2.setPlaca("111111112");
		p2.setQtdRodas(4);
		p2.setVelocMax(160);
		p2.setQtdPassageiros(5);
		m.setQtdPist(4);
		m.setPotencia(250);
		p2.setMotor(m);
		
		System.out.printf("%.1f m/h\n", p2.calcVel(p2.getVelocMax()));
		
		Carga c1 = new Carga();
		c1.setMarca("Jeep");
		c1.setModelo("Renegade");
		c1.setCor("Preto");
		c1.setPlaca("111111113");
		c1.setQtdRodas(4);
		c1.setVelocMax(150);
		c1.setCargaMax(50);
		m.setQtdPist(5);
		m.setPotencia(500);
		c1.setMotor(m);
		
		System.out.printf("%.1f cm/h\n", c1.calcVel(c1.getVelocMax()));
		
		Carga c2 = new Carga();
		c2.setMarca("Volkswagen");
		c2.setModelo("Caminhão");
		c2.setCor("Cinza");
		c2.setPlaca("111111114");
		c2.setQtdRodas(6);
		c2.setVelocMax(80);
		c2.setCargaMax(150);
		m.setQtdPist(6);
		m.setPotencia(600);
		c2.setMotor(m);
		
		System.out.printf("%.1f cm/h\n", c2.calcVel(c2.getVelocMax()));
		
		
	}

}
