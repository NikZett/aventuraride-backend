package cl.duoc.aventuraride.inventario.repository;

import cl.duoc.aventuraride.inventario.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
}