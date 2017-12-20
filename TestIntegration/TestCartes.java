

public class TestCartes{
	ICartes cartes

	public TestCartes(ICartes cartes){
		this.cartes = cartes;
	}
	@Test
	public void testAchatCartesGood(){
		cartes.achatCarte();
		ICarte test=cartes.choixCarte("dragon vert","toto");
		assertNotNull(test);
	}

	@Test
	public void testAchatCartesFail(){
		cartes.achatCarte();
		ICartes test=cartes.choixCarte("chat vert aux yeux rouges","toto");
		assertNull(test);
	}

	@Test
	public void testAchatCartesNoJewel(){
		cartes.achatCarte();
		ICartes test=cartes.choixCarte("Dragon Blanc aux yeux bleu","toto");
		assertNull(test);
	}

	@Test
	public void testAchatDeckGood(){
		boolean test = cartes.achatDeck("winnerdu94");
		assertTrue(test);
	}

	@Test
	public void testAchatDeckFail(){
		boolean test = cartes.achatDeck("bogoss75");
		assertFalse(test);
	}

	@Test
	public void testAchatDeckFailNoBank(){
		boolean test = cartes.achatDeck("Mr_moustache");
		assertFalse(test);
	}
	@Test
	public void testAchatDeckFailNoMoney(){
		boolean test = cartes.achatDeck("nomoney");
		assertFalse(test);
	}
	@Test
	public void testAchatPackGood(){
		boolean test = cartes.achatPack("winnerdu94");
		assertTrue(test);
	}

	@Test
	public void testAchatPackFail(){
		boolean test = cartes.achatPack("bogoss75");
		assertFalse(test);
	}

	@Test
	public void testAchatPackFailNoBank(){
		boolean test = cartes.achatPack("Mr_moustache");
		assertFalse(test);
	}
	@Test
	public void testPackFailNoMoney(){
		boolean test = cartes.achatPack("nomoney");
		assertFalse(test);
	}

	@Test 
	public void creerDeck(){
		int le_int=cartes.ouvrirCreateDeck("bob");
		assertEquals(4,le_int);
		boolean test = cartes.addCarteDeck("bob",4,"chat");
		assertTrue(test);
	}

	@Test
	public void ouvrirPack(){
		boolean test = ouvrirPack("bob");
		assertTrue(test);
	}

	@Test
	public void detruireCartes(){
		boolean test = detruireCarte("bob","Chat");
		assertTrue(test);
	}

	@Test
	public void modifierDeck(){
		boolean test = ouvrirModifDeck("BobDu77");
		assertTrue(test);
		boolean test_2 = removeCarteFromDeck("BobDu77","chat");
		assertTrue(test_2);
		boolean test_3 = addCarteDeck("BobDu77");
		assertTrue(test_3);
	}
}