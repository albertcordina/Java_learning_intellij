import java.util.ArrayList;

class Patient {
    private String patientId;
    private String patientName;
    private String dateOfBirth;

    public Patient(String patientId, String patientName, String dateOfBirth) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void displayPatientInfo() {
        System.out.println("\nPatient ID: " + patientId + "\nPatient Name: " + patientName + "\nDate of Birth: " + dateOfBirth);
    }
}

class Doctor {
    private String doctorId;
    private String doctorName;
    private String specialization;

    public Doctor(String doctorId, String doctorName, String specialization) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void displayDoctorInfo() {
        System.out.println("\nDoctor ID: " + doctorId + "\nDoctor Name: " + doctorName + "\nSpecialization: " + specialization);
    }
}

class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String date;
    private String time;

    public Appointment(Patient patient, Doctor doctor, String date, String time) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public void displayAppointmentDetails() {
        System.out.println("\nAppointment Date: " + date + "\nAppointment Time: " + time
                + "\nPatient ID: " + patient.getPatientId() + "\nDoctor ID: " + doctor.getDoctorId());
    }
}

class Hospital {
    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;
    private ArrayList<Appointment> appointments;

    public Hospital() {
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    public boolean addPatient(String patientId, String patientName, String dateOfBirth) {
        for (Patient patient : patients) {
            if (patient.getPatientId().equals(patientId)) {
                return false; // Patient with the same ID already exists
            }
        }
        patients.add(new Patient(patientId, patientName, dateOfBirth));
        return true;
    }

    public boolean addDoctor(String doctorId, String doctorName, String specialization) {
        for (Doctor doctor : doctors) {
            if (doctor.getDoctorId().equals(doctorId)) {
                return false; // Doctor with the same ID already exists
            }
        }
        doctors.add(new Doctor(doctorId, doctorName, specialization));
        return true;
    }

    public boolean scheduleAppointment(String patientId, String doctorId, String date, String time) {
        Patient patient = findPatient(patientId);
        Doctor doctor = findDoctor(doctorId);
        if (patient != null && doctor != null) {
            appointments.add(new Appointment(patient, doctor, date, time));
            return true;
        }
        return false;
    }

    public void displayPatientInfo() {
        System.out.println("Patients:");
        for (Patient patient : patients) {
            patient.displayPatientInfo();
            System.out.println();
        }
    }

    public void displayDoctorInfo() {
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            doctor.displayDoctorInfo();
            System.out.println();
        }
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    private Patient findPatient(String patientId) {
        for (Patient patient : patients) {
            if (patient.getPatientId().equals(patientId)) {
                return patient;
            }
        }
        return null; // Patient not found
    }

    private Doctor findDoctor(String doctorId) {
        for (Doctor doctor : doctors) {
            if (doctor.getDoctorId().equals(doctorId)) {
                return doctor;
            }
        }
        return null; // Doctor not found
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        // Add patients and doctors
        hospital.addPatient("P532", "Alice", "2000-01-10");
        hospital.addPatient("P122", "Bob", "1995-05-20");

        hospital.addDoctor("D321", "Dr. Holmes", "Cardiology");
        hospital.addDoctor("D322", "Dr. Johnson", "Pediatrics");

        // Display patient and doctor information
        hospital.displayPatientInfo();
        hospital.displayDoctorInfo();

        // Schedule appointments
        hospital.scheduleAppointment("P532", "D321", "2023-09-01", "10:00 AM");
        hospital.scheduleAppointment("P122", "D322", "2023-09-02", "2:00 PM");

        // Display appointment details
        System.out.println("Appointments:");
        for (Appointment appointment : hospital.getAppointments()) {
            appointment.displayAppointmentDetails();
            System.out.println();
        }
    }
}
