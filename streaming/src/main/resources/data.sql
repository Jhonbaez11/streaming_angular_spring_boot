USE gestion_streaming;
-- Tabla "usuarios"
INSERT INTO usuarios (usuario_id, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, correo, telefono, password, rol, usuario_creacion, usuario_actualizacion) VALUES
(1, 'John', 'Doe', 'Smith', '', 'john.doe@example.com', 123456789, 'password123', 1, 'admin', 'admin'),
(2, 'Jane', '', 'Johnson', '', 'jane.johnson@example.com', 123456789, 'password456', 2, 'admin', 'admin'),
(3, 'Michael', '', 'Brown', '', 'michael.brown@example.com', 123456789, 'password789', 2, 'admin', 'admin'),
(4, 'Emily', '', 'Davis', '', 'emily.davis@example.com', 123456789, 'password123', 3, 'admin', 'admin'),
(5, 'Daniel', '', 'Miller', '', 'daniel.miller@example.com', 123456789, 'password456', 2, 'admin', 'admin'),
(6, 'Olivia', '', 'Wilson', '', 'olivia.wilson@example.com', 123456789, 'password789', 2, 'admin', 'admin'),
(7, 'James', '', 'Taylor', '', 'james.taylor@example.com', 123456789, 'password123', 2, 'admin', 'admin');

-- Tabla "streaming"
INSERT INTO streaming (streaming_id, nombre, valor_servicio, valor_perfil, perfiles, usuario_creacion, usuario_actualizacion) VALUES
(1, 'Netflix', 40000, 10000, 4,  'admin', 'admin'),
(2, 'Amazon Prime Video', 25000, 6000, 3, 'admin', 'admin'),
(3, 'Disney+', 25000, 5000, 2, 'admin', 'admin'),
(4, 'HBO Max', 25000, 6000, 5, 'admin', 'admin'),
(5, 'Magis TV', 40000, 15000, 3, 'admin', 'admin');

-- Tabla "suscripciones"
INSERT INTO suscripciones (id_usuario, id_streaming, perfiles_contratados, cuenta_completa, usuario_servicio, password_servicio, usuario_creacion, usuario_actualizacion) VALUES
(1, 1, 2, true, 'john.netflix', 'netflix123', 'admin', 'admin'),
(2, 2, 1, false, 'jane.amazon', 'amazon123', 'admin', 'admin'),
(3, 3, 2, true, 'michael.disney', 'disney123', 'admin', 'admin'),
(4, 4, 3, false, 'emily.hbo', 'hbo123', 'admin', 'admin'),
(5, 5, 1, false, 'daniel.apple', 'apple123', 'admin', 'admin');

-- Tabla "pagos"
INSERT INTO pagos (id_suscripcion, mes, anio, pago, usuario_creacion, usuario_actualizacion) VALUES
(1, 1, 2023, 30000, 'admin', 'admin'),
(2, 1, 2023, 25000, 'admin', 'admin'),
(3, 1, 2023, 15000, 'admin', 'admin'),
(4, 1, 2023, 10000, 'admin', 'admin'),
(5, 1, 2023, 5000, 'admin', 'admin');