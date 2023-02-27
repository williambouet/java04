class Movies {

    public static void main(String[] args) {
        String[] indianaMovies = {"Indiana Jones and the Kingdom of the Crystal Skull", "Indiana Jones and the Last Crusade","Indiana Jones and the Temple of Doom"}; 
        String[] crystal = {"Harrison Ford", "Cate Blanchett"};
        String[] crusade = {"Harrison Ford", "Sean Connery"};
        String[] doom = { "Harrison Ford", "Kate Capshaw" };
        String[][] actors = { crystal, crusade, doom};



        for (int i = 0; i < indianaMovies.length; i++) {
            System.out.println("Dans le film " + indianaMovies[i] + "les acteurs sont : ");
            for (String actor : actors[i]) {
                System.out.println(actor);
            }
        }



    }
}