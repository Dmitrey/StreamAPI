package by.courses.java.streamapi.operation;


public class DefaultStream implements by.courses.java.streamapi.operation.Operation<by.courses.java.streamapi.entity.UserBase> {
    @java.lang.Override
    public java.util.Collection<by.courses.java.streamapi.entity.UserBase> removeWithMaxAge(java.util.Collection<by.courses.java.streamapi.entity.UserBase> entities) {
        return entities.stream().filter(( x) -> (x.getAge()) < (entities.stream().mapToInt(by.courses.java.streamapi.entity.UserBase::getAge).max().getAsInt())).collect(java.util.stream.Collectors.toList());
    }

    @java.lang.Override
    public java.util.Collection<by.courses.java.streamapi.entity.UserBase> removeAllOlder(java.util.Collection<by.courses.java.streamapi.entity.UserBase> entities, int age) {
        return entities.stream().filter(( x) -> (x.getAge()) <= age).collect(java.util.stream.Collectors.toList());
    }

    @java.lang.Override
    public double getAverageAge(java.util.Collection<by.courses.java.streamapi.entity.UserBase> entities) {
        return entities.stream().mapToInt(by.courses.java.streamapi.entity.UserBase::getAge).average().getAsDouble();
    }

    @java.lang.Override
    public by.courses.java.streamapi.entity.UserBase getThirdInCollection(java.util.Collection<by.courses.java.streamapi.entity.UserBase> entities) {
        return entities.stream().skip(2).findFirst().get();
    }

    @java.lang.Override
    public java.util.Collection<by.courses.java.streamapi.entity.UserBase> getTwoUsersStartingFromSecond(java.util.Collection<by.courses.java.streamapi.entity.UserBase> entities) {
        return entities.stream().skip(1).limit(2).collect(java.util.stream.Collectors.toList());
    }

    @java.lang.Override
    public boolean isCharacterPresentInAllNames(java.util.Collection<by.courses.java.streamapi.entity.UserBase> entities, java.lang.String character) {
        return (entities.stream().allMatch(( x) -> x.getName().toLowerCase().contains(character.toLowerCase()))) == true;
    }

    @java.lang.Override
    public java.util.Collection<by.courses.java.streamapi.entity.UserBase> addValueToAllNames(java.util.Collection<by.courses.java.streamapi.entity.UserBase> entities, java.lang.String value) {
        return entities.stream().map(( obj) -> by.courses.java.streamapi.entity.UserBase.of(((obj.getName()) + value), obj.getAge())).collect(java.util.stream.Collectors.toList());
    }

    @java.lang.Override
    public java.util.Collection<by.courses.java.streamapi.entity.UserBase> sortByNameThanByAge(java.util.Collection<by.courses.java.streamapi.entity.UserBase> entities) {
        return entities.stream().sorted(java.util.Comparator.comparing(by.courses.java.streamapi.entity.UserBase::getName).thenComparing(by.courses.java.streamapi.entity.UserBase::getAge)).collect(java.util.stream.Collectors.toList());
    }
}

