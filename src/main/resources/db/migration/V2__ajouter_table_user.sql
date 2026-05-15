CREATE TABLE utilisateur (
                      id BIGINT AUTO_INCREMENT PRIMARY KEY,
                      username VARCHAR(255),
                      email VARCHAR(255),
                      password VARCHAR(255),
                      role VARCHAR(50)
);

ALTER TABLE patient
    ADD utilisateur_id BIGINT;

ALTER TABLE patient
    ADD CONSTRAINT fk_patient_utilisateur
        FOREIGN KEY (utilisateur_id) REFERENCES utilisateur(id);

ALTER TABLE medecin
    ADD utilisateur_id BIGINT;

ALTER TABLE medecin
    ADD CONSTRAINT fk_medecin_utilisateur
        FOREIGN KEY (utilisateur_id) REFERENCES utilisateur(id);