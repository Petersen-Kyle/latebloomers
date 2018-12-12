///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package cit260.cityOfAaronLB.control;
//
//import cit260.cityOfAaronLB.model.Animals;
//import cit260.cityOfAaronLB.model.Game;
//import cit260.cityOfAaronLB.model.Item;
//import cit260.cityOfAaronLB.model.Location;
//import cit260.cityOfAaronLB.model.Map;
//import cit260.cityOfAaronLB.model.Tools;
//import cit260.cityOfAaronLB.model.Weapons;
//
///**
// *
// * @author lafon
// */
//public class MapControl {
//
//    public static Map createMap(Game game, int noOfRows, int noOfColumns) {
//        if (game == null || noOfRows <= 0 || noOfColumns <= 0) {
//            return null;
//        }
//        Map map = new Map();
//        map.setRows(noOfRows);
//        map.setColumns(noOfColumns);
//        game.setMap(map);
//
//        Location locations[][] = createLocations(noOfRows, noOfColumns);
//        map.setLocations(locations);
//        movePlayerToStartingLocation(map);
//        return map;
//
//    }
//
//    public static Location[][] createLocations(int rows, int columns) {
//        Location[][] locations = new Location[rows][columns];
//        for (int row = 0; row < rows; row++) {
//            for (int column = 0; column < columns; column++) {
//                Location location = new Location();
//                location.setRow(row);
//                location.setColumn(column);
//                location.setVisited(false);
//                locations[row][column] = location;
//            }
//        }
//        locations[0][0].setName("Temple");
//        locations[0][0].setDescription("The beautiful white temple stands on the hill a sparkling \n"
//                + "bastion of peace.  A steady line of the faithful wind their \n"
//                + "way ever closer to worship at the beautiful ediface. You are \n"
//                + "humbled by its shear magisty and the sacrifice made by the \n"
//                + "people to make it so beautiful.");
//        locations[0][0].setSceneSymbol("TE");
//        locations[0][0].setItem(createItem(Weapons.sling));
//        
//        locations[0][1].setName("Wheat Field");
//        locations[0][1].setDescription("The Wheat Field is flowing in the breeze, ready to harvest");
//        locations[0][1].setSceneSymbol("WF");
//
//        locations[0][2].setName("Wheat Field");
//        locations[0][2].setDescription("The golden wheat field glows in the noon day sun");
//        locations[0][2].setSceneSymbol("WF");
//        locations[0][3].setName("River");
//        locations[0][3].setDescription("The great river Sidon enters the Land of Aaron here. \n"
//                + "Its rushing waters bring life to all the lands that it \n"
//                + "touches.  Care must be taken not to live or plant too \n"
//                + "near the river due to its nature to flood in the spring.");
//        locations[0][3].setSceneSymbol("RV");
//        locations[0][4].setName("Granary");
//        locations[0][4].setDescription("This large set of granary bins is used by all \n"
//                + "the people of the area to store the surplus wheat. \n"
//                + "In times of famine these grain bins provide a steady \n"
//                + "source of food for the people of Aaron.");
//        locations[0][4].setSceneSymbol("GN");
//        locations[1][0].setName("Wheat Field");
//        locations[1][0].setDescription("This field is full of new rising wheat plants. \n"
//                + "You can see people from the village carefully \n"
//                + "weeding the rows, destroying bugs that might cause \n"
//                + "harm to the growing plants.");
//        locations[1][0].setSceneSymbol("WF");
//        locations[1][1].setName("Wheat Field");
//        locations[1][1].setDescription("The tender shoots of a newly planted field are \n"
//                + "just visable after the recent rain. Strange \n"
//                + "looking scarecrows are stationed stratigicly \n"
//                + "throughout the area to keep the wild birds from /n"
//                + "eating the tiny growths.");
//        locations[1][1].setSceneSymbol("WF");
//        locations[1][2].setName("River");
//        locations[1][2].setDescription("The river speads out in this area. Slowing its \n"
//                + "rapid flow and making an easy crossing point for \n"
//                + "travelers.  You can see youth spashing around in \n"
//                + "the water cooling off in the heat of the day.  ");
//        locations[1][2].setSceneSymbol("RV");
//        locations[1][3].setName("Wheat Field");
//        locations[1][3].setDescription("This wheat field is almost completely grown. \n"
//                + "Nearly ready to harvest, villagers are bringing \n"
//                + "in baskets, and setting up a treshing floor so \n"
//                + "that once the harvest begins it can be completed \n"
//                + "quickly.");
//        locations[1][3].setSceneSymbol("WF");
//        locations[1][4].setName("Wheat Field");
//        locations[1][4].setDescription("The nearly grown wheat in this field is completly \n"
//                + "unattended.  Only the soft breeze, the sound of small \n"
//                + "insects and the distant river can be heard here.");
//        locations[1][4].setSceneSymbol("WF");
//        locations[2][0].setName("Wheat Field");
//        locations[2][0].setDescription("The land here slopes down slightly from the river \n"
//                + "with irrigation furrows carrying the water to the \n"
//                + "wheat plants.  Several men and youth are working to \n"
//                + "deepen and stabalize the irragation furrows to keep the \n"
//                + "plants watered. ");
//        locations[2][0].setSceneSymbol("WF");
//        locations[2][1].setName("River");
//        locations[2][1].setDescription("The river becomes very deep here, flowing quickly \n"
//                + "through the area.  Lined by huge trees on both sides, \n "
//                + "fishermen often come to this area catching the fish \n"
//                + "that hide in the shadows from the trees.");
//        locations[2][1].setSceneSymbol("RV");
//        locations[2][2].setName("Rulers Court");
//        locations[2][2].setDescription("Deeply dug trenches lead to tall mounds of earth \n"
//                + "topped with wodden pickets.  Soldiers patrol the walls, \n"
//                + "taking turns at watch on the towers, watching for attacks \n"
//                + "from any direction.  The threat of Lamanite attack is always \n"
//                + "possible, and Captain Moroni has ordered that a constant watch \n"
//                + "be kept.  Swift riders are stationed near the entrance to \n"
//                + "bring word of attack to the outlieing areas.  Durning an attack \n"
//                + "all the poeple of the village, and surrounding area would come \n"
//                + "to the rulers court for protection from the invaders.");
//        locations[2][2].setSceneSymbol("RC");
//        locations[2][3].setName("Wheat Field");
//        locations[2][3].setDescription("A freshly husked field is laid before your eyes. \n"
//                + "You are excited to replant as the sun goes down on \n"
//                + "a days hard work.");
//        locations[2][3].setSceneSymbol("WF");
//        locations[2][4].setName("Storehouse");
//        locations[2][4].setDescription("You can tell that hard work has been done \n"
//                + "as the shelves are filled with items of all \n"
//                + "kinds.");
//        locations[2][4].setSceneSymbol("SH");
//        locations[3][0].setName("River");
//        locations[3][0].setDescription("You hear the frogs croak as the river makes \n"
//                + "its way through. Water cascading down over \n"
//                + "rocks and fallen branches.");
//        locations[3][0].setSceneSymbol("RV");
//        locations[3][1].setName("Wheat Field");
//        locations[3][1].setDescription("Children running thorugh the stalks playing hide \n"
//                + "and seek fill your view and the stalks gently \n"
//                + "sway from the tiny feet running past them.");
//        locations[3][1].setSceneSymbol("WF");
//        locations[3][2].setName("Wheat Field");
//        locations[3][2].setDescription("The smell of wheat fills your nostrils as you \n"
//                + "take in a deep breathe of the sweet aroma. The \n"
//                + "colors of brown and yellow dance before your eyes \n"
//                + "as the stalks sway in the wind.");
//        locations[3][2].setSceneSymbol("WF");
//        locations[3][3].setName("Wheat Field");
//        locations[3][3].setDescription("Nothing but wheat for miles around. You stare \n"
//                + "as the ensuing sunset casts shadows over the \n"
//                + "the field illuminating it different colors.");
//        locations[3][3].setSceneSymbol("WF");
//        locations[3][4].setName("Wheat Field");
//        locations[3][4].setDescription("The tall stalks brush across your face as you make \n"
//                + "your way through the golden fields. The sun shines \n"
//                + "even brighter as it glints off the stalks.");
//        locations[3][4].setSceneSymbol("WF");
//        locations[4][0].setName("Undeveloped");
//        locations[4][0].setDescription("You smell the sweet aroma of flowers as you gaze \n "
//                + "at the beauty around you. Weeds liter the ground \n"
//                + "with bits of color scaterred between them.");
//        locations[4][0].setSceneSymbol("??");
//        locations[4][1].setName("Undeveloped");
//        locations[4][1].setDescription("Trees loom high above you as you watch in awe \n"
//                + "at the birds fluttering about. you catch a glimpse \n"
//                + "of a deer making its way through the brush.");
//        locations[4][1].setSceneSymbol("??");
//        locations[4][2].setName("Undeveloped");
//        locations[4][2].setDescription("Tall greass liters that land with all kinds of \n"
//                + "flowers growing between the blades. It seems \n"
//                + "peaceful as the sun warms your face.");
//        locations[4][2].setSceneSymbol("??");
//        locations[4][3].setName("Villiage");
//        locations[4][3].setDescription("Humble homes line the streets and children are running \n"
//                + "through the streets as you enter the villiage. People \n"
//                + "greet you as you make your way down the dirt roads worn \n"
//                + "by many feet bustling about. You see people going about \n "
//                + "tending to fields and cattle preparing to feed thier\n"
//                + "families and those in need.");
//        locations[4][3].setSceneSymbol("VG");
//        locations[4][4].setName("Undeveloped");
//        locations[4][4].setDescription("You enter a large field of dirt and fresh mud \n"
//                + "created from the freshly fallen rain. You watch \n"
//                + "your step as you move around envisioning the \n"
//                + "potential the land has to become something great.");
//        locations[4][4].setSceneSymbol("??");
//
//        return locations;
//    }
//
//    public static int getItemLocation(Item[] items, String itemType) {
//        int count = 0;
//        for (Item item : items) {
//            if (item.getItemType().equals(itemType)) {
//                return count;
//            }
//            count++;
//
//        }
//        return -1;
//
//    }
//
//    public static Item createItem(Weapons weapon) {
//        Item item = new Item();
//        item.setItemType(weapon.getItemType());
//        item.setItemName(weapon.getItemName());
//        item.setPostiveDescription(weapon.getPositiveDescription());
//        item.setAdjustments(weapon.getAdjustments());
//        return item;
//    }
////
////    public static Item createItem(Tools tool) {
////        Item item = new Item();
////        item.setItemType(tool.getItemType());
////        item.setItemName(tool.getItemName());
////        item.setDescription(tool.getDescription());
////        item.setAdjustments(tool.getAdjustments());
////        return item;
////
////    }
////
////    public static Item createItem(Animals animal) {
////        Item item = new Item();
////        item.setItemType(animal.getItemType());
////        item.setItemName(animal.getItemName());
////        item.setDescription(animal.getDescription());
////        item.setAdjustments(animal.getAdjustments());
////        return item;
////    }
//    
//    
//
//    public static Item createItem(String itemType, String itemName, String description, int adjustment) {
//        if (itemName == null) {
//            return null;
//        }
//        Item item = new Item();
//
//        item.setItemType(itemType);
//        item.setItemName(itemName);
//        item.setDescription(description);
//        item.setAdjustments(adjustment);
//        return item;
//    }
//    
//    public static void movePlayerToStartingLocation(Map map) {
//        movePlayer(map, 2, 2); // or instead of 0,0 you can select a different starting location
//    }
//
//    public static void movePlayer(Map map, int row, int column) {
//        map.setCurrentLocation(map.getLocations()[row][column]);
//        map.getCurrentLocation().setVisited(true);
//        map.setCurrentRow(row);
//        map.setCurrentColumn(column);
//    }
//}
