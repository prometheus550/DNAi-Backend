package com.dnai.config;

import com.dnai.entities.Doctor;
import com.dnai.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private DoctorRepository doctorRepo;

    @Override
    public void run(String... args) throws Exception {
        if (doctorRepo.findByEmail("testdoctor@gmail.com").isEmpty()) {
            Doctor testDoc = new Doctor();
<<<<<<< HEAD
            testDoc.setName("Dr. Test");
            testDoc.setEmail("testdoctor@gmail.com");
            testDoc.setSpeciality("General");
            testDoc.setPasswordHash("dummy123");

=======
            testDoc.setname("Dr. Test");
            testDoc.setemail("testdoctor@gmail.com");
            testDoc.setspeciality("General");
            testDoc.setpasswordHash("dummy123");
            
>>>>>>> ee9185323096aaac8424b2e6ae580fc08f686a77
            doctorRepo.save(testDoc);
            System.out.println("✅ TEST DOCTOR CREATED: testdoctor@gmail.com");
        }
    }
}
