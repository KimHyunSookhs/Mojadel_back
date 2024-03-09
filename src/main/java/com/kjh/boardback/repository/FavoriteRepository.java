package com.kjh.boardback.repository;

import com.kjh.boardback.repository.resultSet.GetFavoriteListResultSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kjh.boardback.entity.FavoriteEntity;
import com.kjh.boardback.entity.primaryKey.FavoritePk;

import java.util.List;

@Repository
public interface FavoriteRepository extends JpaRepository<FavoriteEntity, FavoritePk> {

    FavoriteEntity findByBoardNumberAndUserEmail(Integer boarNumber,String UserEmail);

    @Query(
            value =
            "SELECT "+
                    "U.email AS email, "+
                    "U.nickname AS nickname, "+
                    "U.profile_image AS profileImage "+
                    "FROM favorite AS F "+
                    "INNER JOIN user AS U "+
                    "ON F.user_email = U.email "+
                    "WHERE F.board_number = ? ",
            nativeQuery = true
    )
    List<GetFavoriteListResultSet> getFavoriteList(Integer boardNumber);
    
}
