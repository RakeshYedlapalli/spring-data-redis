package com.vishaluplanch.org.pojo;

import com.vishaluplanch.org.vo.ApplicantDetail;
import com.vishaluplanch.org.vo.CollateralDetail;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class LoanDetailPojo {

    ///private List<List<String>>  events;

    public static void main(String[] args) {
        List<Event>  events = new ArrayList<>();
        List<Event > listofSub = new ArrayList<>();


        List<Integer> duplicates = Arrays.asList(1,2,4,5,6,5);


        long   unique = duplicates.stream()
                .distinct()
               .count();

        System.out.println(unique);
    }


}

@AllArgsConstructor
class Event {

    private List<Event> list;
}