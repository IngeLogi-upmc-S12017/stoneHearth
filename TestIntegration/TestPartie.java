public class TestPartie{
	public void testLancerPartie(){
		ICompteUtilisateur cu = this.lancerPartie(j1,j2,d1,d2);
		assertNotNull(cu);
	}

	public void testLancerPartieFail(){
		ICompteUtilisateur cu = this.lancerPartie(j1,j2,d1,d2);
		assertNull(cu);
	}
}