public interface Tree {
    String getSpecies();

    Trunk getTrunk();

    Branches getBranches();

    String getLeafs();

    default String grow() {
        return "I'm growing!";
    }

    String leafsDropping();
}
