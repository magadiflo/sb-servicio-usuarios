INSERT INTO usuarios(username, password, enabled, nombre, apellido, email) VALUES('magadiflo', '$2a$10$kdsfw.v.2wg2/xJ6Bq52d./yF8MOas4RALW43rGH4gM2K5mbjVPaS', true, 'Martín', 'Díaz', 'magadiflo@magadiflo.com');
INSERT INTO usuarios(username, password, enabled, nombre, apellido, email) VALUES('admin', '$2a$10$932tMLvG8FkadCYyQstQE.f56WTfTENrlNty63sRkubDU/GrXNS9u', true, 'Admin', 'Admin', 'admin@magadiflo.com');

INSERT INTO roles(nombre) VALUES('ROLE_USER'); 
INSERT INTO roles(nombre) VALUES('ROLE_ADMIN');

INSERT INTO usuarios_roles(usuario_id, role_id) VALUES(1,1);
INSERT INTO usuarios_roles(usuario_id, role_id) VALUES(2,2);
INSERT INTO usuarios_roles(usuario_id, role_id) VALUES(2,1);