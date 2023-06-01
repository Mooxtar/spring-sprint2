package kz.bitlab.springboot.sprint2.db;

import kz.bitlab.springboot.sprint2.db.Music;

import java.util.ArrayList;

public class DBManager {
    private static final ArrayList<Music> musics = new ArrayList<>();
    private static Long id = 6L;





    public static void addMusic(Music music) {
        music.setId(id);
        id++;
        musics.add(music);
    }

    public static Music getMusic(int id) {
        return musics.stream().filter(music -> music.getId() == id).findFirst().orElse(null);
    }

    private static final ArrayList<ApplicationRequest> applicationRequests = new ArrayList<>();



    public static ArrayList<ApplicationRequest> getApplicationRequests() {
        return applicationRequests;
    }

    public static void addApplicationRequest(ApplicationRequest applicationRequest) {
        applicationRequest.setId(++id);
        applicationRequests.add(applicationRequest);
    }

    public static void saveApplicationRequest(Long id) {
        for (int i = 0; i < applicationRequests.size(); i++) {
            System.out.println(id + " " + applicationRequests.get(i).getId());
            if (applicationRequests.get(i).getId() == id) {
                applicationRequests.get(i).setHandled(true);
                System.out.println("efahejrflkbrlkvbjaer");
            }
            System.out.println("wth");

        }
    }

    public static ApplicationRequest getApplicationRequest(int id) {
        return applicationRequests.stream()
                .filter(applicationRequest -> applicationRequest.getId() == id).
                findFirst().orElse(null);
    }


}
