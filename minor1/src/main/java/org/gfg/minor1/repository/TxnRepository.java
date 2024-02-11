package org.gfg.minor1.repository;

import org.gfg.minor1.model.Txn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface TxnRepository extends JpaRepository<Txn, Integer> {

    Txn findByTxnId(String txnId);
    @Modifying
    @Transactional
    @Query(value = "insert into txn (created_on, paid_amount, status, txn_id, updated_on, book_id, student_id) VALUES ('2024-01-28 15:45:37.391000', 100, 'ISSUED', '74e82b17-6e17-4236-9956-3d1f3f24e9d6', '2024-01-28 15:45:37.39100', 1, 1)", nativeQuery = true)
    public void runMyQuery();
}
