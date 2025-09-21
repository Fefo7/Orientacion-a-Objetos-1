package io.github.unlp_oo.Ejercicio_11_Cuenta_con_ganchos;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Ejercicio11.CajaDeAhorro;
import Ejercicio11.CuentaCorriente;
public class CuentaTest {

	CuentaCorriente cuenta1,cuenta2;
	CajaDeAhorro cajaAhorro1,cajaAhorro2;
	@BeforeEach
	void setUp() throws Exception {
		// se crean intancias y seteo de valores antes de los test
		
		cuenta1 = new CuentaCorriente();
		cuenta2 = new CuentaCorriente();
		cajaAhorro1 = new CajaDeAhorro();
		cajaAhorro2 = new CajaDeAhorro();
		
		cuenta1.setLimiteDescubierto(-200);
		cuenta2.setLimiteDescubierto(-400);
		
		
	
	}
	
	@Test
    void testDepositar()  // cada test es independiente 
	{
		cuenta1.depositar(1000);
		cuenta2.depositar(2000);
		cajaAhorro1.depositar(1000);
		
		assertEquals(980,cajaAhorro1.getSaldo());
		assertEquals(1000,cuenta1.getSaldo());
		assertEquals(2000,cuenta2.getSaldo());
	} 
	@Test
	void testExtraer() 
	{
		cuenta1.depositar(1000);
		cuenta2.depositar(2000);
		cajaAhorro1.depositar(1000);
		
		assertEquals(true, cajaAhorro1.extraer(800));
		assertEquals(false, cajaAhorro1.extraer(200));
		assertEquals(false, cajaAhorro1.extraer(-200));
		
		assertEquals(true, cuenta1.extraer(800));
		assertEquals(true, cuenta1.extraer(250));
		assertEquals(false, cuenta1.extraer(400));
		assertEquals(false, cuenta1.extraer(-100));
	} 
	@Test
	void testTransferir() 
	{
		cuenta1.depositar(1000);
		cuenta2.depositar(2000);
		cajaAhorro1.depositar(1000);
		assertEquals(false, cuenta2.transferirACuenta(200, null));
		assertEquals(true, cuenta2.transferirACuenta(200, cuenta1)); // caso exitoso de transferencia
		assertEquals(true, cuenta2.transferirACuenta(200, cajaAhorro2)); // caso transferir de una cuenta a caja2 -> 
		assertEquals(false, cuenta2.transferirACuenta(3000, cuenta1));	
		 
		assertEquals(false, cajaAhorro2.transferirACuenta(200, null));
		assertEquals(true, cajaAhorro2.transferirACuenta(100, cuenta1));// caso caja2 a cuenta
		assertEquals(false, cajaAhorro2.transferirACuenta(3000, cajaAhorro1)); // caso sin saldo de transferencia
	} 
}
