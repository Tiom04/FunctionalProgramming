package com.endava.internship.service;

import com.endava.internship.domain.Privilege;
import com.endava.internship.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public interface UserService {

    List<String> getFirstNamesReverseSorted(List<User> users);

    List<User> sortByAgeDescAndNameAsc(List<User> users);

    List<Privilege> getAllDistinctPrivileges(List<User> users);

    Optional<User> getUpdateUserWithAgeHigherThan(List<User> users, int age);

    Map<Integer, List<User>> groupByCountOfPrivileges(List<User> users);

    double getAverageAgeForUsers(List<User> users);

    Optional<String> getMostFrequentLastName(List<User> users);

    List<User> filterBy(List<User> users, Predicate<User>... predicates);

    String convertTo(List<User> users, String delimiter, Function<User, String> mapFun);

    Map<Privilege, List<User>> groupByPrivileges(List<User> users);

    Map<String, Long> getNumberOfLastNames(final List<User> users);
}


