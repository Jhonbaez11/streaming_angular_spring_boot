CREATE TABLE IF NOT EXISTS usuarios (
  usuario_id INT NOT NULL,
  primer_nombre VARCHAR(50),
  segundo_nombre VARCHAR(50) DEFAULT NULL,
  primer_apellido VARCHAR(50),
  segundo_apellido VARCHAR(50) DEFAULT NULL,
  correo VARCHAR(100) DEFAULT NULL,
  telefono INT(15) DEFAULT NULL,
  password VARCHAR(100) DEFAULT NULL,
  rol INT(2) DEFAULT NULL,
  fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  usuario_creacion VARCHAR(50) DEFAULT NULL,
  fecha_actualizacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  usuario_actualizacion VARCHAR(50) DEFAULT NULL,
  PRIMARY KEY (usuario_id),
  UNIQUE (usuario_id)
);

CREATE TABLE IF NOT EXISTS streaming (
  streaming_id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(100),
  valor_servicio DECIMAL(10, 0),
  valor_perfil DECIMAL(10, 0),
  perfiles INT,
  fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  usuario_creacion VARCHAR(50),
  fecha_actualizacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  usuario_actualizacion VARCHAR(50),
  UNIQUE (streaming_id)
);

CREATE TABLE IF NOT EXISTS suscripciones (
  suscripciones_id INT PRIMARY KEY AUTO_INCREMENT,
  id_usuario INT,
  id_streaming INT,
  perfiles_contratados INT,
  cuenta_completa BOOLEAN,
  usuario_servicio VARCHAR(50),
  password_servicio VARCHAR(100),
  fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  usuario_creacion VARCHAR(50),
  fecha_actualizacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  usuario_actualizacion VARCHAR(50),
  FOREIGN KEY (id_usuario) REFERENCES usuarios(usuario_id),
  FOREIGN KEY (id_streaming) REFERENCES streaming(streaming_id)
);

CREATE TABLE IF NOT EXISTS pagos (
  pagos_id INT PRIMARY KEY AUTO_INCREMENT,
  id_suscripcion INT,
  mes INT,
  anio INT,
  pago DECIMAL(10, 0),
  fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  usuario_creacion VARCHAR(50),
  fecha_actualizacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  usuario_actualizacion VARCHAR(50),
  FOREIGN KEY (id_suscripcion) REFERENCES suscripciones(suscripciones_id)
);