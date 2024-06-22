package org.example.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

public class User {
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("username")
    private String username;
    @JsonProperty("email")
    private String email;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("website")
    private String website;
    @JsonProperty("company")
    private Company company;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public Company getCompany() {
        return company;
    }

    @JsonRootName("address")
    public static class Address {
        @JsonProperty("street")
        private String street;
        @JsonProperty("suite")
        private String suite;
        @JsonProperty("city")
        private String city;
        @JsonProperty("zipcode")
        private String zipCode;
        @JsonProperty("geo")
        private Geo geo;

        public String getStreet() {
            return street;
        }

        public String getSuite() {
            return suite;
        }

        public String getCity() {
            return city;
        }

        public String getZipCode() {
            return zipCode;
        }

        public Geo getGeo() {
            return geo;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", suite='" + suite + '\'' +
                    ", city='" + city + '\'' +
                    ", zipCode='" + zipCode + '\'' +
                    ", geo=" + geo +
                    '}';
        }
    }

    @JsonRootName("geo")
    public static class Geo {

        @JsonProperty("lat")
        private double latitud;
        @JsonProperty("lng")
        private double longitud;

        public double getLatitud() {
            return latitud;
        }

        public double getLongitud() {
            return longitud;
        }

        @Override
        public String toString() {
            return "Geo{" +
                    "latitud=" + latitud +
                    ", longitud=" + longitud +
                    '}';
        }
    }

    @JsonRootName("company")
    public static class Company {
        @JsonProperty("name")
        private String name;
        @JsonProperty("catchPhrase")
        private String catchPhrase;
        @JsonProperty("bs")
        private String bs;

        public String getName() {
            return name;
        }

        public String getCatchPhrase() {
            return catchPhrase;
        }

        public String getBs() {
            return bs;
        }

        @Override
        public String toString() {
            return "Company{" +
                    "name='" + name + '\'' +
                    ", catchPhrase='" + catchPhrase + '\'' +
                    ", bs='" + bs + '\'' +
                    '}';
        }
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", company=" + company +
                '}';
    }
}
