package com.jspider.fullabstractionusinginterface2;

/******************** Declaration ****************************/
interface Translator {
	void translate();
}

/************************************************/

/******************** Implementation ****************************/
class KannadaTranslator implements Translator {

	@Override
	public void translate() {
		System.out.println("translate to kannada");
	}

}

class HindiTranslator implements Translator {

	@Override
	public void translate() {
		System.out.println("translate to hindi");
	}
}

class FrenchTranslator implements Translator {

	@Override
	public void translate() {
		System.out.println("translate to french");
	}
}

/************************************************/

/******************* Service Layer *****************************/
class GoogleTranslate {
	static void translateTo(Translator t) {
		if (t != null) {
			t.translate();
		}
	}
}

/************************************************/

/****************** Creating Object ******************************/
public class TranslatorExampleLikeGoogleTranslate6 {
	public static void main(String[] args) {
		KannadaTranslator kt = new KannadaTranslator();
		HindiTranslator ht = new HindiTranslator();
		FrenchTranslator ft = new FrenchTranslator();

		GoogleTranslate.translateTo(kt);// Internally UpCasting
		GoogleTranslate.translateTo(ht);// Internally UpCasting
		GoogleTranslate.translateTo(ft);// Internally UpCasting
	}
}
/************************************************/

//translate to kannada
//translate to hindi
//translate to french
