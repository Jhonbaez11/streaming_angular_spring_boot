package com.nabsystem33.streaming.repository;

import com.nabsystem33.streaming.entity.GeneralEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GeneralRepo extends JpaRepository<GeneralEntity, Long> {
    @Query(value = "SELECT u.primer_nombre, u.primer_apellido, st.nombre, st.valor_servicio, st.valor_perfil, su.perfiles_contratados, su.cuenta_completa, p.mes, p.anio, SUM(p.pago) AS total_pago, CASE WHEN su.cuenta_completa = 1 THEN st.valor_servicio WHEN su.cuenta_completa = 0 THEN (st.valor_perfil*su.perfiles_contratados) ELSE 0 END AS total_pagar FROM usuarios u JOIN suscripciones su ON su.id_usuario = u.usuario_id JOIN pagos p ON p.id_suscripcion = su.suscripciones_id JOIN streaming st ON st.streaming_id = su.id_streaming GROUP BY u.primer_nombre, u.primer_apellido, st.nombre, st.valor_servicio, st.valor_perfil, su.perfiles_contratados, su.cuenta_completa, p.mes, p.anio;", nativeQuery = true)
    List<Object[]> getGeneralData();
}