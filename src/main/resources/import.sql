INSERT INTO usuarios(username, password, enabled, nombre, apellido, email) VALUES('magadiflo', '12345', 1, 'Martín', 'Díaz', 'magadiflo@magadiflo.com');
INSERT INTO usuarios(username, password, enabled, nombre, apellido, email) VALUES('admin', '12345', 1, 'Admin', 'Admin', 'admin@magadiflo.com');

INSERT INTO roles(nombre) VALUES('ROLE_USER'); 
INSERT INTO roles(nombre) VALUES('ROLE_ADMIN');

INSERT INTO usuarios_roles(usuario_id, role_id) VALUES(1,1);
INSERT INTO usuarios_roles(usuario_id, role_id) VALUES(2,2);
INSERT INTO usuarios_roles(usuario_id, role_id) VALUES(2,1);