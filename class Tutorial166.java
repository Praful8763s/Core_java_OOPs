class Tutorial166 {
    public static void main(String[] args) {

        int year = 0, invest, alternate;

        while (alternate > invest) {
            year++; // year = year + 1;

            // yearly produce income form alternate solution
            // 9 % of 1000 = 90
            alternate = year * 90;

            // yearly produced income from machine
            // 1000 per year - [6000(machine cost) - 2000(salvage or scrap value of
            // machine)]
            // 1000 * year - [6000-2000]
            invest = (1000 * year) - 4000;

        }
        System.out.println("The Life of Machine:" + year);
    }

}
