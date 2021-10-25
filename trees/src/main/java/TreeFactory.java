public final class TreeFactory {
    public static final String CONIFEROUS_TREE = "CONIFEROUS TREE";
    public static final String LEAFY_TREE = "LEAFY TREE";

    public static Tree createTree(String species, Trunk trunk, Branches branches, String leafs) {
        switch (species) {
            case CONIFEROUS_TREE:
                return new ConiferousTree(species, trunk, branches, leafs);
            case LEAFY_TREE:
                return new LeafyTree(species, trunk, branches, leafs);
            default:
                return null;

        }
    }
}
