package com.shopping.reposietories;

import com.shopping.models.TransactionReports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionReportRepository extends JpaRepository<TransactionReports ,Long> {
}
