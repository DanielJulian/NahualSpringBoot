package ar.edu.undav.semillero.domain.entity;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class GraduatedTest {

	@Test
	public void testCreation() {
		String nombre = "nombre";
		Node node = new Node();
		Graduated graduated = new Graduated(nombre, node, new Date()); // Actualizar
																		// Assert
		Assert.assertEquals(nombre, graduated.getName());
		Assert.assertEquals(false, graduated.getDeleted());
	}

	@Test
	public void testAddInterview() {
		Graduated graduated = new Graduated();
		Assert.assertTrue(graduated.getInterviews().isEmpty());

		graduated.addInterview(new Interview());
		Assert.assertEquals(1, graduated.getInterviews().size());
	}

}
