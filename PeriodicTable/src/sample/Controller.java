package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {

//======================================================================================
//      FX Id's
//======================================================================================

    @FXML public Button hydrogen;
    @FXML public Button helium;
    @FXML public Button lithium;
    @FXML public Button beryllium;
    @FXML public Button boron;
    @FXML public Button carbon;
    @FXML public Button nitrogen;
    @FXML public Button oxygen;
    @FXML public Button fluorine;
    @FXML public Button neon;
    @FXML public Button sodium;
    @FXML public Button magnesium;
    @FXML public Button aluminum;
    @FXML public Button silicon;
    @FXML public Button phosphorus;
    @FXML public Button sulfur;
    @FXML public Button chlorine;
    @FXML public Button argon;
    @FXML public Button potassium;
    @FXML public Button calcium;
    @FXML public Button scandium;
    @FXML public Button titanium;
    @FXML public Button vanadium;
    @FXML public Button chromium;
    @FXML public Button manganese;
    @FXML public Button iron;
    @FXML public Button cobalt;
    @FXML public Button nickel;
    @FXML public Button copper;
    @FXML public Button zinc;
    @FXML public Button gallium;
    @FXML public Button germanium;
    @FXML public Button arsenic;
    @FXML public Button selenium;
    @FXML public Button bromine;
    @FXML public Button krypton;
    @FXML public Button rubidium;
    @FXML public Button strontium;
    @FXML public Button yttrium;
    @FXML public Button zirconium;
    @FXML public Button niobium;
    @FXML public Button molybdenum;
    @FXML public Button technetium;
    @FXML public Button ruthenium;
    @FXML public Button rhodium;
    @FXML public Button palladium;
    @FXML public Button silver;
    @FXML public Button cadmium;
    @FXML public Button indium;
    @FXML public Button tin;
    @FXML public Button antimony;
    @FXML public Button tellurium;
    @FXML public Button iodine;
    @FXML public Button xenon;
    @FXML public Button cesium;
    @FXML public Button barium;
    @FXML public Button lanthanum;
    @FXML public Button cerium;
    @FXML public Button praseodymium;
    @FXML public Button neodymium;
    @FXML public Button promethium;
    @FXML public Button samarium;
    @FXML public Button europium;
    @FXML public Button gadolinium;
    @FXML public Button terbium;
    @FXML public Button dysprosium;
    @FXML public Button holmium;
    @FXML public Button erbium;
    @FXML public Button thulium;
    @FXML public Button ytterbium;
    @FXML public Button lutetium;
    @FXML public Button hafnium;
    @FXML public Button tantalum;
    @FXML public Button tungsten;
    @FXML public Button rhenium;
    @FXML public Button osmium;
    @FXML public Button iridium;
    @FXML public Button platinum;
    @FXML public Button gold;
    @FXML public Button mercury;
    @FXML public Button thallium;
    @FXML public Button lead;
    @FXML public Button bismuth;
    @FXML public Button polonium;
    @FXML public Button astatine;
    @FXML public Button radon;
    @FXML public Button francium;
    @FXML public Button radium;
    @FXML public Button actinium;
    @FXML public Button thorium;
    @FXML public Button protactinium;
    @FXML public Button uranium;
    @FXML public Button neptunium;
    @FXML public Button plutonium;
    @FXML public Button americium;
    @FXML public Button curium;
    @FXML public Button berkelium;
    @FXML public Button californium;
    @FXML public Button einsteinium;
    @FXML public Button fermium;
    @FXML public Button mendelevium;
    @FXML public Button nobelium;
    @FXML private Button lawrencium;
    @FXML public Button rutherfordium;
    @FXML public Button dubnium;
    @FXML public Button seaborgium;
    @FXML public Button bohrium;
    @FXML public Button hassium;
    @FXML public Button meitnerium;
    @FXML public Button darmstadtium;
    @FXML public Button roentgenium;
    @FXML public Button copernicium;
    @FXML public Button nihonium;
    @FXML public Button flerovium;
    @FXML public Button moscovium;
    @FXML public Button livermorium;
    @FXML public Button tennessine;
    @FXML public Button oganesson;

    @FXML private TextField atomicNumber;
    @FXML private TextField element;
    @FXML private TextField atomicMass;
    @FXML private TextField classification;

//======================================================================================
//======================================================================================


    // prints the element name into the Textfield ...

    @FXML
    private void hydrogenButtonPressed(ActionEvent event) {
        atomicNumber.setText("1");
        element.setText("Hydrogen");
        atomicMass.setText("1.008");
        classification.setText("Other-Non Metals");
    }


    @FXML
    private void heliumButtonPressed(ActionEvent event) {
        atomicNumber.setText("2");
        element.setText("Helium");
        atomicMass.setText("4.0026");
        classification.setText("Noble gases");
    }

    @FXML
    private void lithiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("3");
        element.setText("Lithium");
        atomicMass.setText("6.94");
        classification.setText("Alkali metals");
    }

    @FXML
    private void berylliumButtonPressed(ActionEvent event) {
        atomicNumber.setText("4");
        element.setText("Beryllium");
        atomicMass.setText("9.0122");
        classification.setText("Alkaline earth metals");
    }

    @FXML
    private void boronButtonPressed(ActionEvent event) {
        atomicNumber.setText("5");
        element.setText("Boron");
        atomicMass.setText("10.81");
        classification.setText("Metalloids");
    }

    @FXML
    private void carbonButtonPressed(ActionEvent event) {
        atomicNumber.setText("6");
        element.setText("Carbon");
        atomicMass.setText("12.011");
        classification.setText("Other-Non Metals");
    }

    @FXML
    private void nitrogenButtonPressed(ActionEvent event) {
        atomicNumber.setText("7");
        element.setText("Nitrogen");
        atomicMass.setText("14.007");
        classification.setText("Other-Non Metals");
    }

    @FXML
    private void oxygenButtonPressed(ActionEvent event) {
        atomicNumber.setText("8");
        element.setText("Oxygen");
        atomicMass.setText("15.999");
        classification.setText("Other-Non Metals");
    }

    @FXML
    private void fluorineButtonPressed(ActionEvent event) {
        atomicNumber.setText("9");
        element.setText("Fluorine");
        atomicMass.setText("18.998");
        classification.setText("Other-Non Metals");
    }

    @FXML
    private void neonButtonPressed(ActionEvent event) {
        atomicNumber.setText("10");
        element.setText("Neon");
        atomicMass.setText("20.180");
        classification.setText("Noble gases");
    }

    @FXML
    private void sodiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("11");
        element.setText("Sodium");
        atomicMass.setText("22.990");
        classification.setText("Alkali metals");
    }

    @FXML
    private void magnesiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("12");
        element.setText("Magnesium");
        atomicMass.setText("24.305");
        classification.setText("Alkaline earth metals");
    }

    @FXML
    private void aluminumButtonPressed(ActionEvent event) {
        atomicNumber.setText("13");
        element.setText("Aluminum");
        atomicMass.setText("26.982");
        classification.setText("Post-Transition metals");
    }

    @FXML
    private void siliconButtonPressed(ActionEvent event) {
        atomicNumber.setText("14");
        element.setText("Silicon");
        atomicMass.setText("28.085");
        classification.setText("Metalloids");
    }

    @FXML
    private void phosphorusButtonPressed(ActionEvent event) {
        atomicNumber.setText("15");
        element.setText("Phosphorus");
        atomicMass.setText("30.974");
        classification.setText("Other-Non Metals");
    }

    @FXML
    private void sulfurButtonPressed(ActionEvent event) {
        atomicNumber.setText("16");
        element.setText("Sulfur");
        atomicMass.setText("32.06");
        classification.setText("Other-Non Metals");
    }

    @FXML
    private void chlorineButtonPressed(ActionEvent event) {
        atomicNumber.setText("17");
        element.setText("Chlorine");
        atomicMass.setText("35.45");
        classification.setText("Other-Non Metals");
    }

    @FXML
    private void argonButtonPressed(ActionEvent event) {
        atomicNumber.setText("18");
        element.setText("Argon");
        atomicMass.setText("39.948");
        classification.setText("Noble gases");
    }

    @FXML
    private void potassiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("19");
        element.setText("Potassium");
        atomicMass.setText("39.098");
        classification.setText("Alkali metals");
    }

    @FXML
    private void calciumButtonPressed(ActionEvent event) {
        atomicNumber.setText("20");
        element.setText("Calcium");
        atomicMass.setText("40.078");
        classification.setText("Alkaline earth metals");
    }

    @FXML
    private void scandiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("21");
        element.setText("Scandium");
        atomicMass.setText("44.956");
        classification.setText("Transition metals");
    }

    @FXML
    private void titaniumButtonPressed(ActionEvent event) {
        atomicNumber.setText("22");
        element.setText("Titanium");
        atomicMass.setText("47.876");
        classification.setText("Transition metals");
    }

    @FXML
    private void vanadiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("23");
        element.setText("Vanadium");
        atomicMass.setText("50.942");
        classification.setText("Transition metals");
    }

    @FXML
    private void chromiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("24");
        element.setText("Chromium");
        atomicMass.setText("51.996");
        classification.setText("Transition metals");
    }

    @FXML
    private void manganeseButtonPressed(ActionEvent event) {
        atomicNumber.setText("25");
        element.setText("Manganese");
        atomicMass.setText("54.938");
        classification.setText("Transition metals");
    }

    @FXML
    private void ironButtonPressed(ActionEvent event) {
        atomicNumber.setText("26");
        element.setText("Iron");
        atomicMass.setText("55.845");
        classification.setText("Transition metals");
    }

    @FXML
    private void cobaltButtonPressed(ActionEvent event) {
        atomicNumber.setText("27");
        element.setText("Cobalt");
        atomicMass.setText("58.933");
        classification.setText("Transition metals");
    }

    @FXML
    private void nickelButtonPressed(ActionEvent event) {
        atomicNumber.setText("28");
        element.setText("Nickel");
        atomicMass.setText("58.693");
        classification.setText("Transition metals");
    }

    @FXML
    private void copperButtonPressed(ActionEvent event) {
        atomicNumber.setText("29");
        element.setText("Copper");
        atomicMass.setText("63.546");
        classification.setText("Transition metals");
    }

    @FXML
    private void zincButtonPressed(ActionEvent event) {
        atomicNumber.setText("30");
        element.setText("Zinc");
        atomicMass.setText("65.38");
        classification.setText("Transition metals");
    }

    @FXML
    private void galliumButtonPressed(ActionEvent event) {
        atomicNumber.setText("31");
        element.setText("Gallium");
        atomicMass.setText("69.723");
        classification.setText("Post-Transition metals");
    }

    @FXML
    private void germaniumButtonPressed(ActionEvent event) {
        atomicNumber.setText("32");
        element.setText("Germanium");
        atomicMass.setText("72.630");
        classification.setText("Metalloids");
    }

    @FXML
    private void arsenicButtonPressed(ActionEvent event) {
        atomicNumber.setText("33");
        element.setText("Arsenic");
        atomicMass.setText("74.922");
        classification.setText("Metalloids");
    }

    @FXML
    private void seleniumButtonPressed(ActionEvent event) {
        atomicNumber.setText("34");
        element.setText("Selenium");
        atomicMass.setText("78.971");
        classification.setText("Other-Non Metals");
    }

    @FXML
    private void bromineButtonPressed(ActionEvent event) {
        atomicNumber.setText("35");
        element.setText("Bromine");
        atomicMass.setText("79.904");
        classification.setText("Other-Non Metals");
    }

    @FXML
    private void kryptonButtonPressed(ActionEvent event) {
        atomicNumber.setText("36");
        element.setText("Krypton");
        atomicMass.setText("83.798");
        classification.setText("Noble gases");
    }

    @FXML
    private void rubidiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("37");
        element.setText("Rubidium");
        atomicMass.setText("85.468");
        classification.setText("Alkali metals");
    }

    @FXML
    private void strontiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("38");
        element.setText("Strontium");
        atomicMass.setText("87.62");
        classification.setText("Alkaline earth metals");
    }

    @FXML
    private void yttriumButtonPressed(ActionEvent event) {
        atomicNumber.setText("39");
        element.setText("Yttrium");
        atomicMass.setText("88.906");
        classification.setText("Transition metals");
    }

    @FXML
    private void zirconiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("40");
        element.setText("Zirconium");
        atomicMass.setText("91.224");
        classification.setText("Transition metals");
    }

    @FXML
    private void niobiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("41");
        element.setText("Niobium");
        atomicMass.setText("92.906");
        classification.setText("Transition metals");
    }

    @FXML
    private void molybdenumButtonPressed(ActionEvent event) {
        atomicNumber.setText("42");
        element.setText("Molybdenum");
        atomicMass.setText("95.95");
        classification.setText("Transition metals");
    }

    @FXML
    private void technetiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("43");
        element.setText("Technetium");
        atomicMass.setText("(98) no stable isotope found");
        classification.setText("Transition metals");
    }

    @FXML
    private void rutheniumButtonPressed(ActionEvent event) {
        atomicNumber.setText("44");
        element.setText("Ruthenium");
        atomicMass.setText("101.07");
        classification.setText("Transition metals");
    }

    @FXML
    private void rhodiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("45");
        element.setText("Rhodium");
        atomicMass.setText("102.91");
        classification.setText("Transition metals");
    }

    @FXML
    private void palladiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("46");
        element.setText("Palladium");
        atomicMass.setText("106.42");
        classification.setText("Transition metals");
    }

    @FXML
    private void silverButtonPressed(ActionEvent event) {
        atomicNumber.setText("47");
        element.setText("Silver");
        atomicMass.setText("107.87");
        classification.setText("Transition metals");
    }

    @FXML
    private void cadmiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("48");
        element.setText("Cadmium");
        atomicMass.setText("112.41");
        classification.setText("Transition metals");
    }

    @FXML
    private void indiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("49");
        element.setText("Indium");
        atomicMass.setText("114.82");
        classification.setText("Post-Transition metals");
    }

    @FXML
    private void tinButtonPressed(ActionEvent event) {
        atomicNumber.setText("50");
        element.setText("Tin");
        atomicMass.setText("118.71");
        classification.setText("Post-Transition metals");
    }

    @FXML
    private void antimonyButtonPressed(ActionEvent event) {
        atomicNumber.setText("51");
        element.setText("Antimony");
        atomicMass.setText("121.76");
        classification.setText("Metalloids");
    }

    @FXML
    private void telluriumButtonPressed(ActionEvent event) {
        atomicNumber.setText("52");
        element.setText("Tellurium");
        atomicMass.setText("127.60");
        classification.setText("Metalloids");
    }

    @FXML
    private void iodineButtonPressed(ActionEvent event) {
        atomicNumber.setText("53");
        element.setText("Iodine");
        atomicMass.setText("126.90");
        classification.setText("Other-Non Metals");
    }

    @FXML
    private void xenonButtonPressed(ActionEvent event) {
        atomicNumber.setText("54");
        element.setText("Xenon");
        atomicMass.setText("131.29");
        classification.setText("Noble gases");
    }

    @FXML
    private void cesiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("55");
        element.setText("Cesium");
        atomicMass.setText("132.91");
        classification.setText("Alkali metals");
    }

    @FXML
    private void bariumButtonPressed(ActionEvent event) {
        atomicNumber.setText("56");
        element.setText("Barium");
        atomicMass.setText("137.33");
        classification.setText("Alkaline earth metals");
    }

    @FXML
    private void lanthanumButtonPressed(ActionEvent event) {
        atomicNumber.setText("57");
        element.setText("Lanthanum");
        atomicMass.setText("138.91");
        classification.setText("Lanthanoids");
    }

    @FXML
    private void ceriumButtonPressed(ActionEvent event) {
        atomicNumber.setText("58");
        element.setText("Cerium");
        atomicMass.setText("140.12");
        classification.setText("Lanthanoids");
    }

    @FXML
    private void praseodymiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("59");
        element.setText("Praseodymium");
        atomicMass.setText("140.91");
        classification.setText("Lanthanoids");
    }

    @FXML
    private void neodymiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("60");
        element.setText("Neodymium");
        atomicMass.setText("144.24");
        classification.setText("Lanthanoids");
    }

    @FXML
    private void promethiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("61");
        element.setText("Promethium");
        atomicMass.setText("(145) no stable isotope found");
        classification.setText("Lanthanoids");
    }

    @FXML
    private void samariumButtonPressed(ActionEvent event) {
        atomicNumber.setText("62");
        element.setText("Samarium");
        atomicMass.setText("150.36");
        classification.setText("Lanthanoids");
    }

    @FXML
    private void europiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("63");
        element.setText("Europium");
        atomicMass.setText("151.96");
        classification.setText("Lanthanoids");
    }

    @FXML
    private void gadoliniumButtonPressed(ActionEvent event) {
        atomicNumber.setText("64");
        element.setText("Gadolinium");
        atomicMass.setText("157.25");
        classification.setText("Lanthanoids");
    }

    @FXML
    private void terbiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("65");
        element.setText("Terbium");
        atomicMass.setText("158.93");
        classification.setText("Lanthanoids");
    }

    @FXML
    private void dysprosiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("66");
        element.setText("Dysprosium");
        atomicMass.setText("162.50");
        classification.setText("Lanthanoids");
    }

    @FXML
    private void holmiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("67");
        element.setText("Holmium");
        atomicMass.setText("164.93");
        classification.setText("Lanthanoids");
    }

    @FXML
    private void erbiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("68");
        element.setText("Erbium");
        atomicMass.setText("167.26");
        classification.setText("Lanthanoids");
    }

    @FXML
    private void thuliumButtonPressed(ActionEvent event) {
        atomicNumber.setText("69");
        element.setText("Thulium");
        atomicMass.setText("168.93");
        classification.setText("Lanthanoids");
    }

    @FXML
    private void ytterbiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("70");
        element.setText("Ytterbium");
        atomicMass.setText("173.05");
        classification.setText("Lanthanoids");
    }

    @FXML
    private void lutetiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("71");
        element.setText("Lutetium");
        atomicMass.setText("174.97");
        classification.setText("Lanthanoids");
    }

    @FXML
    private void hafniumButtonPressed(ActionEvent event) {
        atomicNumber.setText("72");
        element.setText("Hafnium");
        atomicMass.setText("178.49");
        classification.setText("Transition metals");
    }

    @FXML
    private void tantalumButtonPressed(ActionEvent event) {
        atomicNumber.setText("73");
        element.setText("Tantalum");
        atomicMass.setText("180.95");
        classification.setText("Other-Non Metals");
    }

    @FXML
    private void tungstenButtonPressed(ActionEvent event) {
        atomicNumber.setText("74");
        element.setText("Tungsten");
        atomicMass.setText("183.84");
        classification.setText("Transition metals");
    }

    @FXML
    private void rheniumButtonPressed(ActionEvent event) {
        atomicNumber.setText("75");
        element.setText("Rhenium");
        atomicMass.setText("186.21");
        classification.setText("Transition metals");
    }

    @FXML
    private void osmiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("76");
        element.setText("Osmium");
        atomicMass.setText("190.23");
        classification.setText("Transition metals");
    }

    @FXML
    private void iridiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("77");
        element.setText("Iridium");
        atomicMass.setText("192.23");
        classification.setText("Transition metals");
    }

    @FXML
    private void platinumButtonPressed(ActionEvent event) {
        atomicNumber.setText("78");
        element.setText("Platinum");
        atomicMass.setText("195.08");
        classification.setText("Transition metals");
    }

    @FXML
    private void goldButtonPressed(ActionEvent event) {
        atomicNumber.setText("79");
        element.setText("Gold");
        atomicMass.setText("196.67");
        classification.setText("Transition metals");
    }

    @FXML
    private void mercuryButtonPressed(ActionEvent event) {
        atomicNumber.setText("80");
        element.setText("Mercury");
        atomicMass.setText("200.59");
        classification.setText("Transition metals");
    }

    @FXML
    private void thalliumButtonPressed(ActionEvent event) {
        atomicNumber.setText("81");
        element.setText("Thallium");
        atomicMass.setText("204.38");
        classification.setText("Post-Transition metals");
    }

    @FXML
    private void leadButtonPressed(ActionEvent event) {
        atomicNumber.setText("82");
        element.setText("Lead");
        atomicMass.setText("207.2");
        classification.setText("Post-Transition metals");
    }

    @FXML
    private void bismuthButtonPressed(ActionEvent event) {
        atomicNumber.setText("83");
        element.setText("Bismuth");
        atomicMass.setText("208.98");
        classification.setText("Post-Transition metals");
    }

    @FXML
    private void poloniumButtonPressed(ActionEvent event) {
        atomicNumber.setText("84");
        element.setText("Polonium");
        atomicMass.setText("(209) no stable isotope found");
        classification.setText("Post-Transition metals");
    }

    @FXML
    private void astatineButtonPressed(ActionEvent event) {
        atomicNumber.setText("85");
        element.setText("Astatine");
        atomicMass.setText("(210) no stable isotope found");
        classification.setText("Metalloids");
    }

    @FXML
    private void radonButtonPressed(ActionEvent event) {
        atomicNumber.setText("86");
        element.setText("Radon");
        atomicMass.setText("(222) no stable isotope found");
        classification.setText("Noble gases");
    }

    @FXML
    private void franciumButtonPressed(ActionEvent event) {
        atomicNumber.setText("87");
        element.setText("Francium");
        atomicMass.setText("(223) no stable isotope found");
        classification.setText("Alkali metals");
    }

    @FXML
    private void radiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("88");
        element.setText("Radium");
        atomicMass.setText("(226) no stable isotope found");
        classification.setText("Alkaline earth metals");
    }

    @FXML
    private void actiniumButtonPressed(ActionEvent event) {
        atomicNumber.setText("89");
        element.setText("Actinium");
        atomicMass.setText("(227) no stable isotope found");
        classification.setText("Actinoids");
    }

    @FXML
    private void thoriumButtonPressed(ActionEvent event) {
        atomicNumber.setText("90");
        element.setText("Thorium");
        atomicMass.setText("232.04");
        classification.setText("Actinoids");
    }

    @FXML
    private void protactiniumButtonPressed(ActionEvent event) {
        atomicNumber.setText("91");
        element.setText("Protactinium");
        atomicMass.setText("231.04");
        classification.setText("Actinoids");
    }

    @FXML
    private void uraniumButtonPressed(ActionEvent event) {
        atomicNumber.setText("92");
        element.setText("Uranium");
        atomicMass.setText("238.03");
        classification.setText("Actinoids");
    }

    @FXML
    private void neptuniumButtonPressed(ActionEvent event) {
        atomicNumber.setText("93");
        element.setText("Neptunium");
        atomicMass.setText("(237) no stable isotope found");
        classification.setText("Actinoids");
    }

    @FXML
    private void plutoniumButtonPressed(ActionEvent event) {
        atomicNumber.setText("94");
        element.setText("Plutonium");
        atomicMass.setText("(244) no stable isotope found");
        classification.setText("Actinoids");
    }

    @FXML
    private void americiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("95");
        element.setText("Americium");
        atomicMass.setText("(243) no stable isotope found");
        classification.setText("Actinoids");
    }

    @FXML
    private void curiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("96");
        element.setText("Curium");
        atomicMass.setText("(247) no stable isotope found");
        classification.setText("Actinoids");
    }

    @FXML
    private void berkeliumButtonPressed(ActionEvent event) {
        atomicNumber.setText("97");
        element.setText("Berkelium");
        atomicMass.setText("(247) no stable isotope found");
        classification.setText("Actinoids");
    }

    @FXML
    private void californiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("98");
        element.setText("Californium");
        atomicMass.setText("(251) no stable isotope found");
        classification.setText("Actinoids");
    }

    @FXML
    private void einsteiniumButtonPressed(ActionEvent event) {
        atomicNumber.setText("99");
        element.setText("Einsteinium");
        atomicMass.setText("(252) no stable isotope found");
        classification.setText("Actinoids");
    }

    @FXML
    private void fermiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("100");
        element.setText("Fermium");
        atomicMass.setText("(257) no stable isotope found");
        classification.setText("Actinoids");
    }

    @FXML
    private void mendeleviumButtonPressed(ActionEvent event) {
        atomicNumber.setText("101");
        element.setText("Mendelevium");
        atomicMass.setText("(258) no stable isotope found");
        classification.setText("Actinoids");
    }

    @FXML
    private void nobeliumButtonPressed(ActionEvent event) {
        atomicNumber.setText("102");
        element.setText("Nobelium");
        atomicMass.setText("(259) no stable isotope found");
        classification.setText("Actinoids");
    }

    @FXML
    private void lawrenciumButtonPressed(ActionEvent event) {
        atomicNumber.setText("103");
        element.setText("Lawrencium");
        atomicMass.setText("(266) no stable isotope found");
        classification.setText("Actinoids");
    }

    @FXML
    private void rutherfordiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("104");
        element.setText("Rutherfordium");
        atomicMass.setText("(267) no stable isotope found");
        classification.setText("Transition metals");
    }

    @FXML
    private void dubniumButtonPressed(ActionEvent event) {
        atomicNumber.setText("105");
        element.setText("Dubnium");
        atomicMass.setText("(268) no stable isotope found");
        classification.setText("Transition metals");
    }

    @FXML
    private void seaborgiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("106");
        element.setText("Seaborgium");
        atomicMass.setText("(269) no stable isotope found");
        classification.setText("Transition metals");
    }

    @FXML
    private void bohriumButtonPressed(ActionEvent event) {
        atomicNumber.setText("107");
        element.setText("Bohrium");
        atomicMass.setText("(270) no stable isotope found");
        classification.setText("Transition metals");
    }

    @FXML
    private void hassiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("108");
        element.setText("Hassium");
        atomicMass.setText("(270) no stable isotope found");
        classification.setText("Transition metals");
    }

    @FXML
    private void meitneriumButtonPressed(ActionEvent event) {
        atomicNumber.setText("109");
        element.setText("Meitnerium");
        atomicMass.setText("(278) no stable isotope found");
        classification.setText("Unknown");
    }

    @FXML
    private void darmstadtiumButtonPressed(ActionEvent event) {
        atomicNumber.setText("110");
        element.setText("Darmstadtium");
        atomicMass.setText("(281) no stable isotope found");
        classification.setText("Unknown");
    }

    @FXML
    private void roentgeniumButtonPressed(ActionEvent event) {
        atomicNumber.setText("111");
        element.setText("Roentgenium");
        atomicMass.setText("(282) no stable isotope found");
        classification.setText("Unknown");
    }

    @FXML
    private void coperniciumButtonPressed(ActionEvent event) {
        atomicNumber.setText("112");
        element.setText("Copernicium");
        atomicMass.setText("(285) no stable isotope found");
        classification.setText("Transition metals");
    }

    @FXML
    private void nihoniumButtonPressed(ActionEvent event) {
        atomicNumber.setText("113");
        element.setText("Nihonium");
        atomicMass.setText("(286) no stable isotope found");
        classification.setText("Unknown");
    }

    @FXML
    private void fleroviumButtonPressed(ActionEvent event) {
        atomicNumber.setText("114");
        element.setText("Flerovium");
        atomicMass.setText("(289) no stable isotope found");
        classification.setText("Post-Transition metals");
    }

    @FXML
    private void moscoviumButtonPressed(ActionEvent event) {
        atomicNumber.setText("115");
        element.setText("Moscovium");
        atomicMass.setText("(290) no stable isotope found");
        classification.setText("Unknown");
    }

    @FXML
    private void livermoriumButtonPressed(ActionEvent event) {
        atomicNumber.setText("116");
        element.setText("Livermorium");
        atomicMass.setText("(293) no stable isotope found");
        classification.setText("Unknown");
    }

    @FXML
    private void tennessineButtonPressed(ActionEvent event) {
        atomicNumber.setText("117");
        element.setText("Tennessine");
        atomicMass.setText("(294) no stable isotope found");
        classification.setText("Unknown");
    }

    @FXML
    private void oganessonButtonPressed(ActionEvent event) {
        atomicNumber.setText("118");
        element.setText("Oganesson");
        atomicMass.setText("(294) no stable isotope found");
        classification.setText("Unknown");
    }

}