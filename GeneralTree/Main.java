class Main {

    public static void main(String[] args) {
        
        GeneralTree gt = new GeneralTree();


        gt.setRoot(10);

        gt.add(5, 10);
        gt.add(11, 10);

        gt.add(4, 11);

        gt.preOrder();

        System.out.println("\n\n");

        gt.remove(10);

        gt.preOrder();
    }
}