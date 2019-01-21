package map;

import enums.Nation;
import enums.Settlement;

import java.util.HashSet;
import java.util.Set;

public class Map {
    //private List<Region> mapRegions = new ArrayList<Region>();
    private Set<Region>regionsSet = new HashSet<>();

    public Set<Region> getRegionsSet() {
        return regionsSet;
    }

    public Map() {
        Region forlindon = new Region("Forlindon");
        regionsSet.add(forlindon);

        Region greyHavens = new Region("Grey Havens");
        greyHavens.setNation(Nation.ELVES);
        greyHavens.setSettlement(Settlement.STRONGHOLD);
        regionsSet.add(greyHavens);

        Region harlindon = new Region("Harlindon");
        regionsSet.add(harlindon);
        Region towerHills = new Region("Tower Hills");
        regionsSet.add(towerHills);

        Region eredLuin = new Region("Ered Luin");
        eredLuin.setNation(Nation.DWARVES);
        eredLuin.setSettlement(Settlement.TOWN);
        regionsSet.add(eredLuin);
        Region northEredLuin = new Region("North Ered Luin");
        northEredLuin.setNation(Nation.DWARVES);
        regionsSet.add(northEredLuin);

        Region evendim = new Region("Evendim");
        regionsSet.add(evendim);

        Region theShire = new Region("The Shire");
        theShire.setNation(Nation.NORTH);
        theShire.setSettlement(Settlement.CITY);
        regionsSet.add(theShire);
        Region buckland= new Region("Buckland");
        buckland.setNation(Nation.NORTH);
        regionsSet.add(buckland);
        Region northDowns = new Region("North Downs");
        northDowns.setNation(Nation.NORTH);
        regionsSet.add(northDowns);
        Region bree = new Region("Bree");
        bree.setNation(Nation.NORTH);
        bree.setSettlement(Settlement.TOWN);
        regionsSet.add(bree);

        Region southEredLuin = new Region("South Ered Luin");
        regionsSet.add(southEredLuin);
        Region minhiriath = new Region("Minhiriath");
        regionsSet.add(minhiriath);
        Region cardolan = new Region("Cardolan");
        regionsSet.add(cardolan);
        Region oldForrest = new Region("Old Forrest");
        regionsSet.add(oldForrest);

        Region arnor = new Region("Arnor");
        arnor.setNation(Nation.SAURON);
        regionsSet.add(arnor);
        Region mountGram = new Region("Mount Gram");
        mountGram.setNation(Nation.SAURON);
        regionsSet.add(mountGram);
        Region mountGundabad = new Region("Mount Gundabad");
        mountGundabad.setNation(Nation.SAURON);
        mountGundabad.setSettlement(Settlement.STRONGHOLD);
        regionsSet.add(mountGundabad);

        Region angmar = new Region("Angmar");
        angmar.setSettlement(Settlement.CITY);
        regionsSet.add(angmar);

        Region ettenmoors = new Region("Ettenmoors");
        regionsSet.add(ettenmoors);
        Region weatherHills = new Region("Weather Hills");
        regionsSet.add(weatherHills);

        Region southDowns = new Region("South Downs");
        regionsSet.add(southDowns);
        Region tharbad = new Region("Tharbad");
        regionsSet.add(tharbad);
        Region enedwaith = new Region("Enedwaith");
        regionsSet.add(enedwaith);
        Region druwaithIaur = new Region("Druwaith Iaur");
        regionsSet.add(druwaithIaur);
        Region andrast = new Region("Andrast");
        regionsSet.add(andrast);

        Region orthanc = new Region("Orthanc");
        orthanc.setNation(Nation.ISENGARD);
        orthanc.setSettlement(Settlement.STRONGHOLD);
        regionsSet.add(orthanc);
        Region gapOfRohan = new Region("Gap of Rohan");
        gapOfRohan.setNation(Nation.ISENGARD);
        regionsSet.add(gapOfRohan);
        Region southDunland = new Region("South Dunland");
        southDunland.setNation(Nation.ISENGARD);
        southDunland.setSettlement(Settlement.TOWN);
        regionsSet.add(southDunland);
        Region northDunland = new Region("North Dunland");
        northDunland.setNation(Nation.ISENGARD);
        northDunland.setSettlement(Settlement.TOWN);
        regionsSet.add(northDunland);

        Region hollin = new Region("Hollin");
        regionsSet.add(hollin);

        Region moria = new Region("Moria");
        moria.setNation(Nation.SAURON);
        moria.setSettlement(Settlement.STRONGHOLD);
        regionsSet.add(moria);

        Region fordsOfBruinen = new Region("Fords of Bruinen");
        regionsSet.add(fordsOfBruinen);
        Region trollshaws = new Region("Trollshaws");
        regionsSet.add(trollshaws);

        Region rivendell= new Region("Rivendell");
        rivendell.setNation(Nation.ELVES);
        rivendell.setSettlement(Settlement.STRONGHOLD);
        regionsSet.add(rivendell);

        Region eaglesEyrie = new Region("Eagles Eyrie");
        regionsSet.add(eaglesEyrie);
        Region highPass = new Region("High Pass");
        regionsSet.add(highPass);
        Region goblinsGate = new Region("Goblins Gate");
        regionsSet.add(goblinsGate);
        Region oldFord = new Region("Old Ford");
        regionsSet.add(oldFord);
        Region gladdenFields = new Region("Gladden Fields");
        regionsSet.add(gladdenFields);
        Region dimrillDale = new Region("Dimrill Dale");
        regionsSet.add(dimrillDale);

        Region lorien = new Region("Lorien");
        lorien.setNation(Nation.ELVES);
        lorien.setSettlement(Settlement.STRONGHOLD);
        regionsSet.add(lorien);

        Region parthCelebrant = new Region("Parth Celebrant");
        regionsSet.add(parthCelebrant);
        Region fangorn = new Region("Fangorn");
        regionsSet.add(fangorn);

        Region fordsOfIsen = new Region("Fords of Isen");
        fordsOfIsen.setNation(Nation.ROHAN);
        fordsOfIsen.setSettlement(Settlement.FORTIFICATION);
        regionsSet.add(fordsOfIsen);
        Region helmsDeep = new Region("Helm's Deep");
        helmsDeep.setNation(Nation.ROHAN);
        helmsDeep.setSettlement(Settlement.STRONGHOLD);
        regionsSet.add(helmsDeep);
        Region westemnet = new Region("Westemnet");
        westemnet.setNation(Nation.ROHAN);
        regionsSet.add(westemnet);
        Region eastemnet = new Region("Eastemnet");
        eastemnet.setNation(Nation.ROHAN);
        regionsSet.add(eastemnet);
        Region edoras = new Region("Edoras");
        edoras.setNation(Nation.ROHAN);
        edoras.setSettlement(Settlement.CITY);
        regionsSet.add(edoras);
        Region folde = new Region("Folde");
        folde.setNation(Nation.ROHAN);
        folde.setSettlement(Settlement.TOWN);
        regionsSet.add(folde);

        Region anfalas = new Region("Anfalas");
        anfalas.setNation(Nation.GONDOR);
        regionsSet.add(anfalas);
        Region erech = new Region("Erech");
        erech.setNation(Nation.GONDOR);
        regionsSet.add(erech);
        Region dolAmroth = new Region("Dol Amroth");
        dolAmroth.setNation(Nation.GONDOR);
        dolAmroth.setSettlement(Settlement.STRONGHOLD);
        regionsSet.add(dolAmroth);
        Region lamedon = new Region("Lamedon");
        lamedon.setNation(Nation.GONDOR);
        lamedon.setSettlement(Settlement.TOWN);
        regionsSet.add(lamedon);
        Region pelargir = new Region("Pelargir");
        pelargir.setNation(Nation.GONDOR);
        pelargir.setSettlement(Settlement.CITY);
        regionsSet.add(pelargir);
        Region lossarnach = new Region("Lossarnach");
        lossarnach.setNation(Nation.GONDOR);
        regionsSet.add(lossarnach);
        Region minasTirith = new Region("Minas Tirith");
        minasTirith.setNation(Nation.GONDOR);
        minasTirith.setSettlement(Settlement.STRONGHOLD);
        regionsSet.add(minasTirith);
        Region druadanForest = new Region("Druadan Forest");
        druadanForest.setNation(Nation.GONDOR);
        regionsSet.add(druadanForest);

        Region southAnduinVale= new Region("South Anduin Vale");
        regionsSet.add(southAnduinVale);
        Region northAnduinVale = new Region("North Anduin Vale");
        regionsSet.add(northAnduinVale);

        Region carrock = new Region("Carrock");
        cardolan.setSettlement(Settlement.TOWN);
        regionsSet.add(carrock);
        Region rhosgobel = new Region("Rhosgobel");
        regionsSet.add(rhosgobel);
        Region oldForestRoad= new Region("Old Forest Road");
        regionsSet.add(oldForestRoad);
        Region dale = new Region("Dale");
        dale.setSettlement(Settlement.CITY);
        regionsSet.add(dale);

        Region northernMirkwood = new Region("Northern Mirkwood");
        regionsSet.add(northernMirkwood);
        Region westernMirkwood = new Region("Western Mirkwood");
        regionsSet.add(westernMirkwood);

        Region woodlandRealm = new Region("Woodland Realm");
        woodlandRealm.setSettlement(Settlement.STRONGHOLD);
        regionsSet.add(woodlandRealm);

        Region narrowsOfTheForest = new Region("Narrows of the Forest");
        regionsSet.add(narrowsOfTheForest);
        Region easternMirkwood = new Region("Eastern Mirkwood");
        regionsSet.add(easternMirkwood);

        Region dolGuldur = new Region("Dol Guldur");
        dolGuldur.setNation(Nation.SAURON);
        dolGuldur.setSettlement(Settlement.STRONGHOLD);
        regionsSet.add(dolGuldur);
        Region southernMirkwood = new Region("Southern Mirkwood");
        southernMirkwood.setNation(Nation.SAURON);
        regionsSet.add(southernMirkwood);

        Region westernBrownLands = new Region("Western Brown Lands");
        regionsSet.add(westernBrownLands);
        Region easternBrownLands = new Region("Eastern Brown Lands");
        regionsSet.add(easternBrownLands);
        Region westernEmynMuil = new Region("Western Emyn Muil");
        regionsSet.add(westernEmynMuil);
        Region easternEmynMuil = new Region("Eastern Emyn Muil");
        regionsSet.add(easternEmynMuil);
        Region deadMarshes = new Region("Dead Marshes");
        regionsSet.add(deadMarshes);
        Region northIthilien = new Region("North Ithilien");
        regionsSet.add(northIthilien);

        Region osgiliath = new Region("Osgiliath");
        osgiliath.setSettlement(Settlement.FORTIFICATION);
        regionsSet.add(osgiliath);

        Region southIthilien = new Region("South Ithilien");
        regionsSet.add(southIthilien);
        Region westHarondor = new Region("West Harondor");
        regionsSet.add(westHarondor);
        Region eastHarondor = new Region("East Harondor");
        regionsSet.add(eastHarondor);

        Region umbar = new Region("Umbar");
        umbar.setNation(Nation.SOUTHEAST);
        umbar.setSettlement(Settlement.STRONGHOLD);
        regionsSet.add(umbar);
        Region nearHarad = new Region("Near Harad");
        nearHarad.setNation(Nation.SOUTHEAST);
        nearHarad.setSettlement(Settlement.TOWN);
        regionsSet.add(nearHarad);
        Region farHarad= new Region("Far Harad");
        farHarad.setNation(Nation.SOUTHEAST);
        farHarad.setSettlement(Settlement.CITY);
        regionsSet.add(farHarad);
        Region khand = new Region("Khand");
        khand.setNation(Nation.SOUTHEAST);
        regionsSet.add(khand);

        Region minasMorgul= new Region("Minas Morgul");
        minasMorgul.setNation(Nation.SAURON);
        minasMorgul.setSettlement(Settlement.STRONGHOLD);
        regionsSet.add(minasMorgul);
        Region nurn= new Region("Nurn");
        nurn.setNation(Nation.SAURON);
        nurn.setSettlement(Settlement.TOWN);
        regionsSet.add(nurn);
        Region gorgoroth= new Region("Gorgoroth");
        gorgoroth.setNation(Nation.SAURON);
        regionsSet.add(gorgoroth);
        Region morannon= new Region("Morannon");
        morannon.setNation(Nation.SAURON);
        morannon.setSettlement(Settlement.STRONGHOLD);
        regionsSet.add(morannon);
        Region baradDur= new Region("Barad Dur");
        baradDur.setNation(Nation.SAURON);
        baradDur.setSettlement(Settlement.STRONGHOLD);
        regionsSet.add(baradDur);

        Region dagorlad = new Region("Dagorlad");
        regionsSet.add(dagorlad);
        Region ashMountains= new Region("Ash Mountains");
        regionsSet.add(ashMountains);

        Region southRhun = new Region("South Rhun");
        southRhun.setNation(Nation.SOUTHEAST);
        southRhun.setSettlement(Settlement.TOWN);
        regionsSet.add(southRhun);
        Region northRhun = new Region("North Rhun");
        northRhun.setNation(Nation.SOUTHEAST);
        northRhun.setSettlement(Settlement.TOWN);
        regionsSet.add(northRhun);
        Region eastRhun= new Region("East Rhun");
        eastRhun.setNation(Nation.SOUTHEAST);
        regionsSet.add(eastRhun);

        Region nomanLands= new Region("Noman Lands");
        regionsSet.add(nomanLands);
        Region southernDorwinion = new Region("Southern Dorwinion");
        regionsSet.add(southernDorwinion);
        Region southernRhovanion = new Region("Southern Rhovanion");
        regionsSet.add(southernRhovanion);
        Region northernDorwinion = new Region("Northern Dorwinion");
        regionsSet.add(northernDorwinion);
        Region northernRhovanion = new Region("Northern Rhovanion");
        regionsSet.add(northernRhovanion);
        Region valeOfTheCelduin = new Region("Vale of the Celduin");
        regionsSet.add(valeOfTheCelduin);

        Region valeOfTheCarnen = new Region("Vale of the Carnen");
        regionsSet.add(valeOfTheCarnen);

        Region witheredHeath = new Region("Withered Heath");
        regionsSet.add(witheredHeath);

        Region erebor = new Region("Erebor");
        erebor.setNation(Nation.DWARVES);
        erebor.setSettlement(Settlement.STRONGHOLD);
        regionsSet.add(erebor);
        Region ironHills = new Region("Iron Hills");
        ironHills.setNation(Nation.DWARVES);
        ironHills.setSettlement(Settlement.TOWN);
        regionsSet.add(ironHills);

        forlindon.getNeighbourRegions().add(greyHavens);

        greyHavens.getNeighbourRegions().add(forlindon);
        greyHavens.getNeighbourRegions().add(harlindon);
        greyHavens.getNeighbourRegions().add(towerHills);
        greyHavens.getNeighbourRegions().add(eredLuin);

        harlindon.getNeighbourRegions().add(greyHavens);
        harlindon.getNeighbourRegions().add(southEredLuin);

        eredLuin.getNeighbourRegions().add(greyHavens);
        eredLuin.getNeighbourRegions().add(northEredLuin);
        eredLuin.getNeighbourRegions().add(evendim);
        eredLuin.getNeighbourRegions().add(towerHills);

        northEredLuin.getNeighbourRegions().add(eredLuin);
        northEredLuin.getNeighbourRegions().add(evendim);

        towerHills.getNeighbourRegions().add(greyHavens);
        towerHills.getNeighbourRegions().add(eredLuin);
        towerHills.getNeighbourRegions().add(evendim);
        towerHills.getNeighbourRegions().add(theShire);
        towerHills.getNeighbourRegions().add(southEredLuin);

        southEredLuin.getNeighbourRegions().add(harlindon);
        southEredLuin.getNeighbourRegions().add(towerHills);
        southEredLuin.getNeighbourRegions().add(theShire);
        southEredLuin.getNeighbourRegions().add(oldForrest);
        southEredLuin.getNeighbourRegions().add(cardolan);
        southEredLuin.getNeighbourRegions().add(minhiriath);

        evendim.getNeighbourRegions().add(northEredLuin);
        evendim.getNeighbourRegions().add(eredLuin);
        evendim.getNeighbourRegions().add(towerHills);
        evendim.getNeighbourRegions().add(theShire);
        evendim.getNeighbourRegions().add(buckland);
        evendim.getNeighbourRegions().add(northDowns);
        evendim.getNeighbourRegions().add(arnor);

        arnor.getNeighbourRegions().add(evendim);
        arnor.getNeighbourRegions().add(northDowns);
        arnor.getNeighbourRegions().add(ettenmoors);
        arnor.getNeighbourRegions().add(angmar);

        theShire.getNeighbourRegions().add(evendim);
        theShire.getNeighbourRegions().add(towerHills);
        theShire.getNeighbourRegions().add(southEredLuin);
        theShire.getNeighbourRegions().add(oldForrest);
        theShire.getNeighbourRegions().add(buckland);

        northDowns.getNeighbourRegions().add(angmar);
        northDowns.getNeighbourRegions().add(evendim);
        northDowns.getNeighbourRegions().add(buckland);
        northDowns.getNeighbourRegions().add(bree);
        northDowns.getNeighbourRegions().add(weatherHills);
        northDowns.getNeighbourRegions().add(ettenmoors);

        buckland.getNeighbourRegions().add(evendim);
        buckland.getNeighbourRegions().add(theShire);
        buckland.getNeighbourRegions().add(oldForrest);
        buckland.getNeighbourRegions().add(cardolan);
        buckland.getNeighbourRegions().add(southDowns);
        buckland.getNeighbourRegions().add(bree);
        buckland.getNeighbourRegions().add(northDowns);

        oldForrest.getNeighbourRegions().add(theShire);
        oldForrest.getNeighbourRegions().add(southEredLuin);
        oldForrest.getNeighbourRegions().add(cardolan);
        oldForrest.getNeighbourRegions().add(buckland);

        minhiriath.getNeighbourRegions().add(southEredLuin);
        minhiriath.getNeighbourRegions().add(cardolan);
        minhiriath.getNeighbourRegions().add(tharbad);
        minhiriath.getNeighbourRegions().add(enedwaith);

        cardolan.getNeighbourRegions().add(southEredLuin);
        cardolan.getNeighbourRegions().add(oldForrest);
        cardolan.getNeighbourRegions().add(buckland);
        cardolan.getNeighbourRegions().add(southDowns);
        cardolan.getNeighbourRegions().add(northDunland);
        cardolan.getNeighbourRegions().add(tharbad);
        cardolan.getNeighbourRegions().add(minhiriath);

        southDowns.getNeighbourRegions().add(cardolan);
        southDowns.getNeighbourRegions().add(buckland);
        southDowns.getNeighbourRegions().add(bree);
        southDowns.getNeighbourRegions().add(weatherHills);
        southDowns.getNeighbourRegions().add(trollshaws);
        southDowns.getNeighbourRegions().add(hollin);
        southDowns.getNeighbourRegions().add(northDunland);

        bree.getNeighbourRegions().add(buckland);
        bree.getNeighbourRegions().add(southDowns);
        bree.getNeighbourRegions().add(weatherHills);
        bree.getNeighbourRegions().add(northDowns);

        weatherHills.getNeighbourRegions().add(bree);
        weatherHills.getNeighbourRegions().add(southDowns);
        weatherHills.getNeighbourRegions().add(trollshaws);
        weatherHills.getNeighbourRegions().add(ettenmoors);
        weatherHills.getNeighbourRegions().add(northDowns);

        ettenmoors.getNeighbourRegions().add(northDowns);
        ettenmoors.getNeighbourRegions().add(weatherHills);
        ettenmoors.getNeighbourRegions().add(trollshaws);
        ettenmoors.getNeighbourRegions().add(mountGram);
        ettenmoors.getNeighbourRegions().add(angmar);
        ettenmoors.getNeighbourRegions().add(arnor);

        angmar.getNeighbourRegions().add(arnor);
        angmar.getNeighbourRegions().add(ettenmoors);
        angmar.getNeighbourRegions().add(mountGram);

        mountGram.getNeighbourRegions().add(angmar);
        mountGram.getNeighbourRegions().add(ettenmoors);
        mountGram.getNeighbourRegions().add(mountGundabad);

        andrast.getNeighbourRegions().add(anfalas);
        andrast.getNeighbourRegions().add(druwaithIaur);

        druwaithIaur.getNeighbourRegions().add(andrast);
        druwaithIaur.getNeighbourRegions().add(fordsOfIsen);
        druwaithIaur.getNeighbourRegions().add(gapOfRohan);
        druwaithIaur.getNeighbourRegions().add(enedwaith);

        enedwaith.getNeighbourRegions().add(minhiriath);
        enedwaith.getNeighbourRegions().add(tharbad);
        enedwaith.getNeighbourRegions().add(southDunland);
        enedwaith.getNeighbourRegions().add(gapOfRohan);
        enedwaith.getNeighbourRegions().add(druwaithIaur);

        tharbad.getNeighbourRegions().add(minhiriath);
        tharbad.getNeighbourRegions().add(cardolan);
        tharbad.getNeighbourRegions().add(northDunland);
        tharbad.getNeighbourRegions().add(southDunland);
        tharbad.getNeighbourRegions().add(enedwaith);

        gapOfRohan.getNeighbourRegions().add(enedwaith);
        gapOfRohan.getNeighbourRegions().add(southDunland);
        gapOfRohan.getNeighbourRegions().add(orthanc);
        gapOfRohan.getNeighbourRegions().add(fordsOfIsen);
        gapOfRohan.getNeighbourRegions().add(druwaithIaur);

        orthanc.getNeighbourRegions().add(gapOfRohan);
        orthanc.getNeighbourRegions().add(fordsOfIsen);

        southDunland.getNeighbourRegions().add(gapOfRohan);
        southDunland.getNeighbourRegions().add(enedwaith);
        southDunland.getNeighbourRegions().add(tharbad);
        southDunland.getNeighbourRegions().add(northDunland);

        northDunland.getNeighbourRegions().add(southDunland);
        northDunland.getNeighbourRegions().add(tharbad);
        northDunland.getNeighbourRegions().add(cardolan);
        northDunland.getNeighbourRegions().add(southDowns);
        northDunland.getNeighbourRegions().add(hollin);
        northDunland.getNeighbourRegions().add(moria);

        hollin.getNeighbourRegions().add(northDunland);
        hollin.getNeighbourRegions().add(southDowns);
        hollin.getNeighbourRegions().add(trollshaws);
        hollin.getNeighbourRegions().add(fordsOfBruinen);
        hollin.getNeighbourRegions().add(moria);

        moria.getNeighbourRegions().add(northDunland);
        moria.getNeighbourRegions().add(hollin);
        moria.getNeighbourRegions().add(dimrillDale);

        trollshaws.getNeighbourRegions().add(southDowns);
        trollshaws.getNeighbourRegions().add(weatherHills);
        trollshaws.getNeighbourRegions().add(ettenmoors);
        trollshaws.getNeighbourRegions().add(rivendell);
        trollshaws.getNeighbourRegions().add(fordsOfBruinen);
        trollshaws.getNeighbourRegions().add(hollin);

        rivendell.getNeighbourRegions().add(trollshaws);
        rivendell.getNeighbourRegions().add(fordsOfBruinen);

        mountGundabad.getNeighbourRegions().add(mountGram);
        mountGundabad.getNeighbourRegions().add(eaglesEyrie);

        fordsOfBruinen.getNeighbourRegions().add(hollin);
        fordsOfBruinen.getNeighbourRegions().add(trollshaws);
        fordsOfBruinen.getNeighbourRegions().add(rivendell);
        fordsOfBruinen.getNeighbourRegions().add(highPass);

        highPass.getNeighbourRegions().add(fordsOfBruinen);
        highPass.getNeighbourRegions().add(goblinsGate);

        goblinsGate.getNeighbourRegions().add(highPass);
        goblinsGate.getNeighbourRegions().add(oldFord);

        eaglesEyrie.getNeighbourRegions().add(mountGundabad);
        eaglesEyrie.getNeighbourRegions().add(carrock);
        eaglesEyrie.getNeighbourRegions().add(oldFord);

        oldFord.getNeighbourRegions().add(eaglesEyrie);
        oldFord.getNeighbourRegions().add(carrock);
        oldFord.getNeighbourRegions().add(rhosgobel);
        oldFord.getNeighbourRegions().add(gladdenFields);
        oldFord.getNeighbourRegions().add(goblinsGate);

        gladdenFields.getNeighbourRegions().add(oldFord);
        gladdenFields.getNeighbourRegions().add(rhosgobel);
        gladdenFields.getNeighbourRegions().add(northAnduinVale);
        gladdenFields.getNeighbourRegions().add(dimrillDale);

        dimrillDale.getNeighbourRegions().add(gladdenFields);
        dimrillDale.getNeighbourRegions().add(northAnduinVale);
        dimrillDale.getNeighbourRegions().add(southAnduinVale);
        dimrillDale.getNeighbourRegions().add(lorien);
        dimrillDale.getNeighbourRegions().add(parthCelebrant);

        lorien.getNeighbourRegions().add(dimrillDale);
        lorien.getNeighbourRegions().add(parthCelebrant);

        parthCelebrant.getNeighbourRegions().add(dimrillDale);
        parthCelebrant.getNeighbourRegions().add(lorien);
        parthCelebrant.getNeighbourRegions().add(southAnduinVale);
        parthCelebrant.getNeighbourRegions().add(westernBrownLands);
        parthCelebrant.getNeighbourRegions().add(eastemnet);
        parthCelebrant.getNeighbourRegions().add(fangorn);

        fangorn.getNeighbourRegions().add(parthCelebrant);
        fangorn.getNeighbourRegions().add(eastemnet);
        fangorn.getNeighbourRegions().add(westemnet);
        fangorn.getNeighbourRegions().add(fordsOfIsen);

        fordsOfIsen.getNeighbourRegions().add(fangorn);
        fordsOfIsen.getNeighbourRegions().add(westemnet);
        fordsOfIsen.getNeighbourRegions().add(helmsDeep);
        fordsOfIsen.getNeighbourRegions().add(druwaithIaur);
        fordsOfIsen.getNeighbourRegions().add(gapOfRohan);
        fordsOfIsen.getNeighbourRegions().add(orthanc);

        anfalas.getNeighbourRegions().add(andrast);
        anfalas.getNeighbourRegions().add(erech);
        anfalas.getNeighbourRegions().add(dolAmroth);

        erech.getNeighbourRegions().add(anfalas);
        erech.getNeighbourRegions().add(lamedon);
        erech.getNeighbourRegions().add(dolAmroth);

        dolAmroth.getNeighbourRegions().add(anfalas);
        dolAmroth.getNeighbourRegions().add(erech);
        dolAmroth.getNeighbourRegions().add(lamedon);

        lamedon.getNeighbourRegions().add(erech);
        lamedon.getNeighbourRegions().add(dolAmroth);
        lamedon.getNeighbourRegions().add(pelargir);

        pelargir.getNeighbourRegions().add(lamedon);
        pelargir.getNeighbourRegions().add(westHarondor);
        pelargir.getNeighbourRegions().add(osgiliath);
        pelargir.getNeighbourRegions().add(lossarnach);

        lossarnach.getNeighbourRegions().add(pelargir);
        lossarnach.getNeighbourRegions().add(osgiliath);
        lossarnach.getNeighbourRegions().add(minasTirith);

        minasTirith.getNeighbourRegions().add(lossarnach);
        minasTirith.getNeighbourRegions().add(osgiliath);
        minasTirith.getNeighbourRegions().add(druadanForest);

        druadanForest.getNeighbourRegions().add(minasTirith);
        druadanForest.getNeighbourRegions().add(osgiliath);
        druadanForest.getNeighbourRegions().add(deadMarshes);
        druadanForest.getNeighbourRegions().add(westernEmynMuil);
        druadanForest.getNeighbourRegions().add(eastemnet);
        druadanForest.getNeighbourRegions().add(folde);

        folde.getNeighbourRegions().add(druadanForest);
        folde.getNeighbourRegions().add(eastemnet);
        folde.getNeighbourRegions().add(westemnet);
        folde.getNeighbourRegions().add(edoras);

        edoras.getNeighbourRegions().add(folde);
        edoras.getNeighbourRegions().add(westemnet);

        westemnet.getNeighbourRegions().add(edoras);
        westemnet.getNeighbourRegions().add(folde);
        westemnet.getNeighbourRegions().add(eastemnet);
        westemnet.getNeighbourRegions().add(fangorn);
        westemnet.getNeighbourRegions().add(fordsOfIsen);
        westemnet.getNeighbourRegions().add(helmsDeep);

        helmsDeep.getNeighbourRegions().add(westemnet);
        helmsDeep.getNeighbourRegions().add(fordsOfIsen);

        eastemnet.getNeighbourRegions().add(fangorn);
        eastemnet.getNeighbourRegions().add(parthCelebrant);
        eastemnet.getNeighbourRegions().add(westernBrownLands);
        eastemnet.getNeighbourRegions().add(westernEmynMuil);
        eastemnet.getNeighbourRegions().add(druadanForest);
        eastemnet.getNeighbourRegions().add(folde);
        eastemnet.getNeighbourRegions().add(westemnet);

        westHarondor.getNeighbourRegions().add(pelargir);
        westHarondor.getNeighbourRegions().add(osgiliath);
        westHarondor.getNeighbourRegions().add(southIthilien);
        westHarondor.getNeighbourRegions().add(eastHarondor);
        westHarondor.getNeighbourRegions().add(nearHarad);
        westHarondor.getNeighbourRegions().add(umbar);

        umbar.getNeighbourRegions().add(westHarondor);
        umbar.getNeighbourRegions().add(nearHarad);

        nearHarad.getNeighbourRegions().add(umbar);
        nearHarad.getNeighbourRegions().add(westHarondor);
        nearHarad.getNeighbourRegions().add(eastHarondor);
        nearHarad.getNeighbourRegions().add(khand);
        nearHarad.getNeighbourRegions().add(farHarad);

        farHarad.getNeighbourRegions().add(nearHarad);
        farHarad.getNeighbourRegions().add(khand);

        khand.getNeighbourRegions().add(farHarad);
        khand.getNeighbourRegions().add(nearHarad);

        eastHarondor.getNeighbourRegions().add(nearHarad);
        eastHarondor.getNeighbourRegions().add(westHarondor);
        eastHarondor.getNeighbourRegions().add(southIthilien);

        southIthilien.getNeighbourRegions().add(eastHarondor);
        southIthilien.getNeighbourRegions().add(westHarondor);
        southIthilien.getNeighbourRegions().add(osgiliath);
        southIthilien.getNeighbourRegions().add(northIthilien);
        southIthilien.getNeighbourRegions().add(minasMorgul);

        osgiliath.getNeighbourRegions().add(pelargir);
        osgiliath.getNeighbourRegions().add(lossarnach);
        osgiliath.getNeighbourRegions().add(minasTirith);
        osgiliath.getNeighbourRegions().add(druadanForest);
        osgiliath.getNeighbourRegions().add(deadMarshes);
        osgiliath.getNeighbourRegions().add(northIthilien);
        osgiliath.getNeighbourRegions().add(southIthilien);
        osgiliath.getNeighbourRegions().add(westHarondor);

        northIthilien.getNeighbourRegions().add(deadMarshes);
        northIthilien.getNeighbourRegions().add(easternEmynMuil);
        northIthilien.getNeighbourRegions().add(dagorlad);
        northIthilien.getNeighbourRegions().add(minasMorgul);
        northIthilien.getNeighbourRegions().add(southIthilien);
        northIthilien.getNeighbourRegions().add(osgiliath);

        deadMarshes.getNeighbourRegions().add(osgiliath);
        deadMarshes.getNeighbourRegions().add(druadanForest);
        deadMarshes.getNeighbourRegions().add(westernEmynMuil);
        deadMarshes.getNeighbourRegions().add(easternEmynMuil);
        deadMarshes.getNeighbourRegions().add(northIthilien);

        westernEmynMuil.getNeighbourRegions().add(druadanForest);
        westernEmynMuil.getNeighbourRegions().add(eastemnet);
        westernEmynMuil.getNeighbourRegions().add(westernBrownLands);
        westernEmynMuil.getNeighbourRegions().add(easternBrownLands);
        westernEmynMuil.getNeighbourRegions().add(easternEmynMuil);
        westernEmynMuil.getNeighbourRegions().add(deadMarshes);

        easternEmynMuil.getNeighbourRegions().add(deadMarshes);
        easternEmynMuil.getNeighbourRegions().add(westernEmynMuil);
        easternEmynMuil.getNeighbourRegions().add(easternBrownLands);
        easternEmynMuil.getNeighbourRegions().add(nomanLands);
        easternEmynMuil.getNeighbourRegions().add(dagorlad);
        easternEmynMuil.getNeighbourRegions().add(northIthilien);

        dagorlad.getNeighbourRegions().add(northIthilien);
        dagorlad.getNeighbourRegions().add(easternEmynMuil);
        dagorlad.getNeighbourRegions().add(nomanLands);
        dagorlad.getNeighbourRegions().add(ashMountains);
        dagorlad.getNeighbourRegions().add(morannon);

        ashMountains.getNeighbourRegions().add(dagorlad);
        ashMountains.getNeighbourRegions().add(nomanLands);
        ashMountains.getNeighbourRegions().add(southernDorwinion);
        ashMountains.getNeighbourRegions().add(southRhun);

        southRhun.getNeighbourRegions().add(ashMountains);
        southRhun.getNeighbourRegions().add(southernDorwinion);
        southRhun.getNeighbourRegions().add(eastRhun);

        southernDorwinion.getNeighbourRegions().add(nomanLands);
        southernDorwinion.getNeighbourRegions().add(southernRhovanion);
        southernDorwinion.getNeighbourRegions().add(northernRhovanion);
        southernDorwinion.getNeighbourRegions().add(southRhun);
        southernDorwinion.getNeighbourRegions().add(ashMountains);

        nomanLands.getNeighbourRegions().add(easternEmynMuil);
        nomanLands.getNeighbourRegions().add(easternBrownLands);
        nomanLands.getNeighbourRegions().add(southernRhovanion);
        nomanLands.getNeighbourRegions().add(southernDorwinion);
        nomanLands.getNeighbourRegions().add(ashMountains);
        nomanLands.getNeighbourRegions().add(dagorlad);

        easternBrownLands.getNeighbourRegions().add(westernBrownLands);
        easternBrownLands.getNeighbourRegions().add(dolGuldur);
        easternBrownLands.getNeighbourRegions().add(southernMirkwood);
        easternBrownLands.getNeighbourRegions().add(southernRhovanion);
        easternBrownLands.getNeighbourRegions().add(nomanLands);
        easternBrownLands.getNeighbourRegions().add(easternEmynMuil);
        easternBrownLands.getNeighbourRegions().add(westernEmynMuil);

        westernBrownLands.getNeighbourRegions().add(eastemnet);
        westernBrownLands.getNeighbourRegions().add(parthCelebrant);
        westernBrownLands.getNeighbourRegions().add(southAnduinVale);
        westernBrownLands.getNeighbourRegions().add(dolGuldur);
        westernBrownLands.getNeighbourRegions().add(easternBrownLands);
        westernBrownLands.getNeighbourRegions().add(westernEmynMuil);

        southAnduinVale.getNeighbourRegions().add(dimrillDale);
        southAnduinVale.getNeighbourRegions().add(northAnduinVale);
        southAnduinVale.getNeighbourRegions().add(dolGuldur);
        southAnduinVale.getNeighbourRegions().add(westernBrownLands);
        southAnduinVale.getNeighbourRegions().add(parthCelebrant);

        dolGuldur.getNeighbourRegions().add(northAnduinVale);
        dolGuldur.getNeighbourRegions().add(narrowsOfTheForest);
        dolGuldur.getNeighbourRegions().add(easternMirkwood);
        dolGuldur.getNeighbourRegions().add(southernMirkwood);
        dolGuldur.getNeighbourRegions().add(easternBrownLands);
        dolGuldur.getNeighbourRegions().add(westernBrownLands);
        dolGuldur.getNeighbourRegions().add(southAnduinVale);

        southernMirkwood.getNeighbourRegions().add(easternMirkwood);
        southernMirkwood.getNeighbourRegions().add(northernRhovanion);
        southernMirkwood.getNeighbourRegions().add(southernRhovanion);
        southernMirkwood.getNeighbourRegions().add(easternBrownLands);
        southernMirkwood.getNeighbourRegions().add(dolGuldur);

        southernRhovanion.getNeighbourRegions().add(southernMirkwood);
        southernRhovanion.getNeighbourRegions().add(northernRhovanion);
        southernRhovanion.getNeighbourRegions().add(valeOfTheCelduin);
        southernRhovanion.getNeighbourRegions().add(northernDorwinion);
        southernRhovanion.getNeighbourRegions().add(southernDorwinion);
        southernRhovanion.getNeighbourRegions().add(nomanLands);
        southernRhovanion.getNeighbourRegions().add(easternBrownLands);

        northernDorwinion.getNeighbourRegions().add(southernDorwinion);
        northernDorwinion.getNeighbourRegions().add(valeOfTheCelduin);
        northernDorwinion.getNeighbourRegions().add(northRhun);
        northernDorwinion.getNeighbourRegions().add(southernDorwinion);

        northRhun.getNeighbourRegions().add(eastRhun);
        northRhun.getNeighbourRegions().add(valeOfTheCarnen);
        northRhun.getNeighbourRegions().add(valeOfTheCelduin);
        northRhun.getNeighbourRegions().add(northernDorwinion);

        valeOfTheCelduin.getNeighbourRegions().add(northRhun);
        valeOfTheCelduin.getNeighbourRegions().add(valeOfTheCarnen);
        valeOfTheCelduin.getNeighbourRegions().add(northernRhovanion);
        valeOfTheCelduin.getNeighbourRegions().add(southernRhovanion);
        valeOfTheCelduin.getNeighbourRegions().add(northernDorwinion);

        northernRhovanion.getNeighbourRegions().add(oldForestRoad);
        northernRhovanion.getNeighbourRegions().add(easternMirkwood);
        northernRhovanion.getNeighbourRegions().add(southernMirkwood);
        northernRhovanion.getNeighbourRegions().add(southernRhovanion);
        northernRhovanion.getNeighbourRegions().add(valeOfTheCelduin);
        northernRhovanion.getNeighbourRegions().add(valeOfTheCarnen);
        northernRhovanion.getNeighbourRegions().add(dale);

        easternMirkwood.getNeighbourRegions().add(oldForestRoad);
        easternMirkwood.getNeighbourRegions().add(narrowsOfTheForest);
        easternMirkwood.getNeighbourRegions().add(dolGuldur);
        easternMirkwood.getNeighbourRegions().add(southernMirkwood);
        easternMirkwood.getNeighbourRegions().add(northernRhovanion);

        narrowsOfTheForest.getNeighbourRegions().add(oldForestRoad);
        narrowsOfTheForest.getNeighbourRegions().add(rhosgobel);
        narrowsOfTheForest.getNeighbourRegions().add(northAnduinVale);
        narrowsOfTheForest.getNeighbourRegions().add(dolGuldur);
        narrowsOfTheForest.getNeighbourRegions().add(easternMirkwood);

        northAnduinVale.getNeighbourRegions().add(rhosgobel);
        northAnduinVale.getNeighbourRegions().add(gladdenFields);
        northAnduinVale.getNeighbourRegions().add(dimrillDale);
        northAnduinVale.getNeighbourRegions().add(southAnduinVale);
        northAnduinVale.getNeighbourRegions().add(dolGuldur);
        northAnduinVale.getNeighbourRegions().add(narrowsOfTheForest);

        rhosgobel.getNeighbourRegions().add(carrock);
        rhosgobel.getNeighbourRegions().add(oldFord);
        rhosgobel.getNeighbourRegions().add(gladdenFields);
        rhosgobel.getNeighbourRegions().add(northAnduinVale);
        rhosgobel.getNeighbourRegions().add(narrowsOfTheForest);
        rhosgobel.getNeighbourRegions().add(oldForestRoad);

        oldForestRoad.getNeighbourRegions().add(carrock);
        oldForestRoad.getNeighbourRegions().add(rhosgobel);
        oldForestRoad.getNeighbourRegions().add(narrowsOfTheForest);
        oldForestRoad.getNeighbourRegions().add(easternMirkwood);
        oldForestRoad.getNeighbourRegions().add(northernRhovanion);
        oldForestRoad.getNeighbourRegions().add(dale);
        oldForestRoad.getNeighbourRegions().add(woodlandRealm);
        oldForestRoad.getNeighbourRegions().add(westernMirkwood);

        dale.getNeighbourRegions().add(woodlandRealm);
        dale.getNeighbourRegions().add(oldForestRoad);
        dale.getNeighbourRegions().add(northernRhovanion);
        dale.getNeighbourRegions().add(valeOfTheCarnen);
        dale.getNeighbourRegions().add(ironHills);
        dale.getNeighbourRegions().add(erebor);
        dale.getNeighbourRegions().add(witheredHeath);

        valeOfTheCarnen.getNeighbourRegions().add(dale);
        valeOfTheCarnen.getNeighbourRegions().add(northernRhovanion);
        valeOfTheCarnen.getNeighbourRegions().add(valeOfTheCelduin);
        valeOfTheCarnen.getNeighbourRegions().add(northRhun);
        valeOfTheCarnen.getNeighbourRegions().add(eastRhun);
        valeOfTheCarnen.getNeighbourRegions().add(ironHills);

        eastRhun.getNeighbourRegions().add(ironHills);
        eastRhun.getNeighbourRegions().add(valeOfTheCarnen);
        eastRhun.getNeighbourRegions().add(northRhun);
        eastRhun.getNeighbourRegions().add(southRhun);

        ironHills.getNeighbourRegions().add(erebor);
        ironHills.getNeighbourRegions().add(dale);
        ironHills.getNeighbourRegions().add(valeOfTheCarnen);
        ironHills.getNeighbourRegions().add(eastRhun);

        erebor.getNeighbourRegions().add(ironHills);
        erebor.getNeighbourRegions().add(dale);
        erebor.getNeighbourRegions().add(witheredHeath);

        witheredHeath.getNeighbourRegions().add(erebor);
        witheredHeath.getNeighbourRegions().add(dale);
        witheredHeath.getNeighbourRegions().add(woodlandRealm);
        witheredHeath.getNeighbourRegions().add(northernMirkwood);

        woodlandRealm.getNeighbourRegions().add(northernMirkwood);
        woodlandRealm.getNeighbourRegions().add(westernMirkwood);
        woodlandRealm.getNeighbourRegions().add(oldForestRoad);
        woodlandRealm.getNeighbourRegions().add(dale);
        woodlandRealm.getNeighbourRegions().add(witheredHeath);

        northernMirkwood.getNeighbourRegions().add(carrock);
        northernMirkwood.getNeighbourRegions().add(westernMirkwood);
        northernMirkwood.getNeighbourRegions().add(woodlandRealm);
        northernMirkwood.getNeighbourRegions().add(witheredHeath);

        westernMirkwood.getNeighbourRegions().add(carrock);
        westernMirkwood.getNeighbourRegions().add(oldForestRoad);
        westernMirkwood.getNeighbourRegions().add(woodlandRealm);
        westernMirkwood.getNeighbourRegions().add(northernMirkwood);

        carrock.getNeighbourRegions().add(eaglesEyrie);
        carrock.getNeighbourRegions().add(oldFord);
        carrock.getNeighbourRegions().add(rhosgobel);
        carrock.getNeighbourRegions().add(oldForestRoad);
        carrock.getNeighbourRegions().add(westernMirkwood);
        carrock.getNeighbourRegions().add(northernMirkwood);

        baradDur.getNeighbourRegions().add(gorgoroth);

        gorgoroth.getNeighbourRegions().add(baradDur);
        gorgoroth.getNeighbourRegions().add(nurn);
        gorgoroth.getNeighbourRegions().add(minasMorgul);
        gorgoroth.getNeighbourRegions().add(morannon);

        nurn.getNeighbourRegions().add(gorgoroth);

        minasMorgul.getNeighbourRegions().add(southIthilien);
        minasMorgul.getNeighbourRegions().add(northIthilien);
        minasMorgul.getNeighbourRegions().add(gorgoroth);

        morannon.getNeighbourRegions().add(gorgoroth);
        morannon.getNeighbourRegions().add(dagorlad);

    }
}
