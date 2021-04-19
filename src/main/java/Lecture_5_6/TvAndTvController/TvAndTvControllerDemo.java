package Lecture_5_6.TvAndTvController;

public class TvAndTvControllerDemo {

    public static void main(String[] args) {

        TvAndTvController tvAndTvController = new TvAndTvController("Sony");

        tvAndTvController.currentVolume = 30;
        tvAndTvController.currentChannel = 25;

        tvAndTvController.tvOn();
        System.out.println("Включен ли телевизор? " + tvAndTvController.tvOn);

        if (tvAndTvController.tvOn == false || tvAndTvController.setTvController()) {
            System.out.println("Ошибка! Включите телевизор или подключите пульт ДУ.");
        }else if (tvAndTvController.tvOn == true) {
            tvAndTvController.addVolume(1);
            System.out.println("Увеличиваем громкость + 1 = " + tvAndTvController.currentVolume);
            tvAndTvController.minusVolume(1);
            System.out.println("Уменьшаем громкость - 1 = " + tvAndTvController.currentVolume);

            tvAndTvController.addChannel(1);
            System.out.println("Переключение канала + 1 = " + tvAndTvController.currentChannel);
            tvAndTvController.minusChannel(1);
            System.out.println("Переключение канала - 1 = " + tvAndTvController.currentChannel);
        } else {
            tvAndTvController.tvController = tvAndTvController.setTvController;
        }

    }
}
