package com.example.proektami.lesson1;

public class RecommenderImplementation {
        public String[] recommendMovies(String movie){
            ContentBasedFilter filter = new ContentBasedFilter();
            String[] results = filter.getRecommendations("Finding Dory");
            return results;
            //return new String[]{"M1","M2","M3"};
        }
}
