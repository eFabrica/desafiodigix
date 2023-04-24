package desafio;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import br.com.desafio.build.CargaFamilia;
import br.com.desafio.model.Familia;
import br.com.desafio.service.FamiliaService;

class PontosFamiliaTest {

	@Test
	void testFamiliaAte900() {
		
		CargaFamilia cf = new CargaFamilia();
		FamiliaService fs = new FamiliaService();		
		List<Familia> lf = fs.analisePontosFamiliaAte900(cf.geraCargaFamilia());
		assertNotNull(lf);
	}
	
	@Test
	void testFamiliaAcima900() {
		
		CargaFamilia cf = new CargaFamilia();
		FamiliaService fs = new FamiliaService();		
		List<Familia> lf = fs.analisePontosFamiliaAcima900(cf.geraCargaFamilia());
		assertNotNull(lf);
	}	

}
